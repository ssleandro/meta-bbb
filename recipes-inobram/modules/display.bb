require inobram.inc

SYSTEMD_SERVICE_${PN} = "${PN}.timer"

FILES_${PN} += "${libdir}"

RDEPENDS_${PN} += " \
    nmap \
    python3-datetime \
    python3-math \
    python3-nmap \
    python3-spidev \
"
