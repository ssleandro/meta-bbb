require inobram.inc

SYSTEMD_SERVICE_${PN} = "${PN}.timer"

RDEPENDS_${PN} += " \
    python3-datetime \
"
