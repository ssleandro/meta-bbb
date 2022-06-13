require inobram-setuptools.inc

SYSTEMD_SERVICE_${PN} = "\
    usb-manager-insert.service \
    usb-manager-remove.service \
"

SYSTEMD_AUTO_ENABLE = "disable"

inobram_install() {
    install -Dm 0644 ${S}/etc/${PN}-insert.service ${D}${systemd_system_unitdir}/${PN}-insert.service
    install -Dm 0644 ${S}/etc/${PN}-remove.service ${D}${systemd_system_unitdir}/${PN}-remove.service
}

RDEPENDS_${PN} = "\
    python3-datetime \
    python3-gevent \
    python3-json \
    python3-redis \
"
