require smaai5.inc

SYSTEMD_PACKAGES += "${PN}-function ${PN}-manager"
SYSTEMD_SERVICE_${PN}-function = "${PN}-function.service"
SYSTEMD_SERVICE_${PN}-manager = "${PN}-manager.service"

PACKAGES += "${PN}-function ${PN}-manager"

RDEPENDS_${PN} += " \
    ${PN}-function \
    ${PN}-manager \
    python-pyserial \
"
