require smaai5.inc

SYSTEMD_SERVICE_${PN} += "${PN}.timer"

RDEPENDS_${PN} += " \
    python-datetime \
"
