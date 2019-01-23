require smaai5.inc

SRCBRANCH = "modbus-v2.0"

SYSTEMD_SERVICE_${PN} = "${PN}.timer"

FILES_${PN} += "${libdir}"

RDEPENDS_${PN} += " \
    nmap \
    python-datetime \
    python-math \
    python-nmap \
    python-spidev \
"
