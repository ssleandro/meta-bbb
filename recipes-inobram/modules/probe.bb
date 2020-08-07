require inobram.inc

SRCBRANCH = "ambientte_1.0.x"

SYSTEMD_PACKAGES += "${PN}-function"
SYSTEMD_SERVICE_${PN}-function = "${PN}-function.service"

PACKAGES += "${PN}-function"
FILES_${PN}-function += "${systemd_system_unitdir}/${PN}-function-control.socket"

RDEPENDS_${PN} += " \
    ${PN}-function \
    python3-pyserial \
"
