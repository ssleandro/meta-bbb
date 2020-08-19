require inobram-setuptools.inc

SRCBRANCH = "ambientte_1.0.x"

SYSTEMD_PACKAGES += "${PN}-manager"
SYSTEMD_SERVICE_${PN}-manager = "${PN}-manager.service"

do_install_append() {
    install -Dm 0644 ${S}/etc/${PN}-control.socket ${D}${systemd_system_unitdir}/${PN}-control.socket
    install -Dm 0644 ${S}/etc/${PN}-manager-control.socket ${D}${systemd_system_unitdir}/${PN}-manager-control.socket
    install -Dm 0644 ${S}/etc/${PN}-manager.service ${D}${systemd_system_unitdir}/${PN}-manager.service
}

PACKAGES += "${PN}-manager"

FILES_${PN} += "${systemd_system_unitdir}/${PN}-control.socket"

FILES_${PN}-manager += "${systemd_system_unitdir}/${PN}-manager-control.socket"

RDEPENDS_${PN} += " \
    ${PN}-manager \
    python3-pyserial \
    python3-sqlite3 \
"
