require smaai5.inc

SYSTEMD_PACKAGES += "${PN}-function"
SYSTEMD_SERVICE_${PN}-function = "${PN}-function.service ${PN}-function-control.socket"

PACKAGES += "${PN}-function"

RDEPENDS_${PN} += " \
    ${PN}-function \
    python-pyserial \
"
