require smaai5.inc

SYSTEMD_PACKAGES += "${PN}-function"
SYSTEMD_SERVICE_${PN}-function = "${PN}-function.service"

PACKAGES += "${PN}-function"
FILES_${PN}-function += "${systemd_system_unitdir}/${PN}-function-control.socket"

RDEPENDS_${PN} += " \
    ${PN}-function \
    python-pyserial \
"
