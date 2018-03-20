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
    chmod -R 0644 ${D}
    find ${D} -type f ! -type l -exec chmod -R 0755 ${D}${libdir}/${BPN} {} +
    find ${D} -type f ! -type l -exec chmod -R 0755 ${D}${bindir} {} +
}

RDEPENDS_${PN} += " \
    python-core \
    python-distutils \
    python-gevent \
    python-redis \
"
