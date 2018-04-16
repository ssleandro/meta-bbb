require smaai5.inc

FILES_${PN} += "${libdir}"

RDEPENDS_${PN} += " \
    nmap \
    python-datetime \
    python-math \
    python-nmap \
    python-spidev \
"
