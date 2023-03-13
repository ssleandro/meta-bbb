require inobram-setuptools.inc

SYSTEMD_SERVICE:${PN} = "\
    usb-manager-insert.service \
    usb-manager-remove.service \
"

SYSTEMD_AUTO_ENABLE = "disable"

inobram_install() {
    install -Dm 0644 ${S}/etc/${PN}-insert.service ${D}${systemd_system_unitdir}/${PN}-insert.service
    install -Dm 0644 ${S}/etc/${PN}-remove.service ${D}${systemd_system_unitdir}/${PN}-remove.service
    install -Dm 0644 ${S}/etc/udev/rules.d/90-usb_manager.rules ${D}${sysconfdir}/udev/rules.d/90-usb_manager.rules
    install -Dm 0755 ${S}/scripts/sh/connected.sh ${D}${bindir}/connected.sh
    install -Dm 0755 ${S}/scripts/sh/disconnected.sh ${D}${bindir}/disconnected.sh
}

RDEPENDS:${PN} = "\
    python3-datetime \
    python3-json \
"
