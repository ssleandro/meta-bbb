require smaai5.inc

SYSTEMD_SERVICE_${PN} = "${PN}.timer"

FILES_${PN} += "${libdir}"

RDEPENDS_${PN} += " \
    nmap \
    python-datetime \
    python-math \
    python-nmap \
    python-spidev \
"
