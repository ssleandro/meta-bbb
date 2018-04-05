LICENSE = "CLOSED"

SRCREV = "${AUTOREV}"
SRC_URI = "git://git@bitbucket.org/inobram/${BPN}.git;protocol=ssh"

S = "${WORKDIR}/git"

PV = "1.0.0+${SRCPV}"

inherit systemd

SYSTEMD_SERVICE_${PN} = "${PN}.service"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
    cp -r ${S}/${BPN}/*  ${D}/
    rm -rf ${D}${localstatedir}/run
    find ${D} -type f -a ! -type l -exec chmod -R 0644 {} +
    find ${D} -type f -a ! -type l -a '(' -name '*.sh' -o -name '*.py' ')' \
         -exec chmod -R 0755 {} +
}

RDEPENDS_${PN} += " \
    python-core \
    python-distutils \
    python-gevent \
    python-redis \
"
