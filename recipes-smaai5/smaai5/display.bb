require smaai5.inc

SRC_URI += "file://0001-display-Use-Python3.patch"

SYSTEMD_SERVICE_${PN} = "${PN}.timer"

FILES_${PN} += "${libdir}"

RDEPENDS_${PN} += " \
    nmap \
    python3-datetime \
    python3-math \
    python3-nmap \
    python3-spidev \
"
