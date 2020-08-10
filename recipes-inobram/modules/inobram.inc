LICENSE = "CLOSED"

MODULE_PN = "${BPN}"
SRCBRANCH ?= "master"
SRC_URI = "git://git@bitbucket.org/inobram/${MODULE_PN}.git;branch=${SRCBRANCH};protocol=ssh"

S = "${WORKDIR}/git"

PV = "1.0+gitr${SRCPV}"
PKGV = "${GITPKGVTAG}"

inherit gitpkgv systemd

SYSTEMD_SERVICE_${PN} = "${MODULE_PN}.service"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
    cp -r ${S}/${MODULE_PN}/* ${D}/
    rm -rf ${D}${localstatedir}/run
    rm -rf ${D}${libdir}/${MODULE_PN}/entrypoint.sh
    rm -rf ${D}${libdir}/${MODULE_PN}/Dockerfile
    find ${D} -type f -a ! -type l -exec chmod -R 0644 {} +
    find ${D} -type f -a ! -type l -a '(' -name '*.sh' -o -name '*.py' ')' \
         -exec chmod -R 0755 {} +
    for d in ${D}${sbindir} ${D}${base_sbindir} \
                 ${D}${bindir} ${D}${base_bindir}; do
        [ -d $d ] && chmod -R 0755 $d || continue
    done
}

pkg_postinst_ontarget_${PN}() {
    dbscript=`echo /usr/lib/${MODULE_PN}/db.py | sed 's,-,_,g'`

    if [ -n "$D" ] && [ -e "$D$dbscript" ]; then
        exit 1
    fi

    if [ -z "$D" ] && [ -e "$dbscript" ]; then
        "$dbscript"
    fi
}

FILES_${PN} += " \
    ${systemd_system_unitdir}/${MODULE_PN}-control.socket \
    ${systemd_system_unitdir}/${MODULE_PN}.service \
"

FILES_${PN}-manager += "${systemd_system_unitdir}/${MODULE_PN}-manager-control.socket"

RDEPENDS_${PN} += " \
    python3-core \
    python3-distutils \
    python3-gevent \
    python3-redis \
"
