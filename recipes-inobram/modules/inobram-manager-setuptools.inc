SYSTEMD_PACKAGES += "${PN}-manager"
SYSTEMD_SERVICE:${PN}-manager = "${PN}-manager.service"

do_install:append() {
    install -Dm 0644 ${S}/etc/${PN}-manager-control.socket ${D}${systemd_system_unitdir}/${PN}-manager-control.socket
    install -Dm 0644 ${S}/etc/${PN}-manager.service ${D}${systemd_system_unitdir}/${PN}-manager.service
}

PACKAGES += "${PN}-manager"

FILES:${PN}-manager += "${systemd_system_unitdir}/${PN}-manager-control.socket"

RDEPENDS:${PN} += "\
    ${PN}-manager \
"
