require inobram.inc

SRCBRANCH = "master"

SYSTEMD_SERVICE:${PN} = "${PN}.timer"

RDEPENDS:${PN} += " \
    python3-datetime \
"
