SUMMARY = "SMAAI5 eMMC installer"
LICENSE = "CLOSED"

SRC_URI = " \
    file://${PN} \
    file://${PN}.service \
"

S = "${WORKDIR}/${PN}-${PV}"

inherit systemd

SYSTEMD_SERVICE_${PN} = "${PN}.service"

do_install() {
    install -Dm 0755 ${WORKDIR}/${PN} ${D}/${bindir}/${PN}
    install -Dm 0644 ${WORKDIR}/${PN}.service ${D}${systemd_unitdir}/system/${PN}.service
}

RDEPENDS_${PN} += " \
    bmap-tools \
    xz \
"
