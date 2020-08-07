require inobram.inc

SRCBRANCH = "ambientte_1.0.x"

SYSTEMD_PACKAGES += "${PN}-fail"
SYSTEMD_SERVICE_${PN}-fail = "fail.service"
SYSTEMD_AUTO_ENABLE_${PN}-fail = "disable"

PACKAGES += "${PN}-fail"

RDEPENDS_${PN} += " \
    ${PN}-fail \
    python3-datetime \
    python3-db \
"
