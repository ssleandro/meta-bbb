require inobram.inc

SRCBRANCH = "master"

SYSTEMD_PACKAGES += "${PN}-fail ${PN}-manager"
SYSTEMD_SERVICE_${PN}-fail = "fail.service"
SYSTEMD_AUTO_ENABLE_${PN}-fail = "disable"
SYSTEMD_SERVICE_${PN}-manager = "${PN}-manager.service"

PACKAGES += "${PN}-fail ${PN}-manager"

RDEPENDS_${PN} += " \
    ${PN}-fail \
    python3-datetime \
    python3-db \
"
