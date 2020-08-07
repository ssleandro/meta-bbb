require inobram.inc

SRCBRANCH = "ambientte_1.0.x"

SYSTEMD_PACKAGES += "${PN}-manager"
SYSTEMD_SERVICE_${PN}-manager = "${PN}-manager.service"

PACKAGES += "${PN}-manager"

RDEPENDS_${PN} += " \
    ${PN}-manager \
    python3-datetime \
    python3-db \
"
