require smaai5.inc

SRCBRANCH = "modbus-v2.0"

SYSTEMD_PACKAGES += "${PN}-manager"
SYSTEMD_SERVICE_${PN}-manager = "${PN}-manager.service"

PACKAGES += "${PN}-manager"

RDEPENDS_${PN} += " \
    ${PN}-manager \
"
