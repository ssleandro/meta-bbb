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
    find ${D} -type f ! -type l -name *.py \
         ! -name *.service ! -name *.timer \
         -exec chmod -R 0755 {} +
}

RDEPENDS_${PN} += " \
    python-core \
    python-distutils \
    python-gevent \
    python-redis \
"
