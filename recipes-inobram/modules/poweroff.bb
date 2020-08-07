require inobram.inc

SRCBRANCH = "ambientte_1.0.x"

SYSTEMD_SERVICE_${PN} = "${PN}.timer"

RDEPENDS_${PN} += " \
    python3-datetime \
"
