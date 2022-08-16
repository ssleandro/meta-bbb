require inobram.inc

SRCBRANCH = "master"

SYSTEMD_SERVICE_${PN} = "${PN}.timer"

RDEPENDS_${PN} += " \
    python3-datetime \
"
