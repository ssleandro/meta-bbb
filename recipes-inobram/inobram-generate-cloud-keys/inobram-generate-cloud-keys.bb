DESCRIPTION = "Generate Inobram cloud keys"
LICENSE = "CLOSED"

SRC_URI = " \
    file://${BPN} \
    file://${BPN}.service \
"

inherit systemd

do_configure[noexec] = "1"
do_compile[noexec] = "1"

SYSTEMD_SERVICE:${PN} = "${PN}.service"

do_install() {
    install -Dm 0755 ${WORKDIR}/${PN} ${D}${bindir}/${PN}
    install -Dm 0644 ${WORKDIR}/${PN}.service ${D}${systemd_system_unitdir}/${PN}.service
}

RDEPENDS:${PN} += "openssl-bin"
