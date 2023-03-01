require inobram.inc

SRCBRANCH = "master"

SYSTEMD_PACKAGES += "${PN}-fail ${PN}-manager"
SYSTEMD_SERVICE:${PN}-fail = "fail.service"
SYSTEMD_AUTO_ENABLE:${PN}-fail = "disable"
SYSTEMD_SERVICE:${PN}-manager = "${PN}-manager.service"

PACKAGES += "${PN}-fail ${PN}-manager"

RDEPENDS:${PN} += " \
    ${PN}-fail \
    python3-datetime \
    python3-db \
"
