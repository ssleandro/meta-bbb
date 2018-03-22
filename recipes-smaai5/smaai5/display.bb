require smaai5.inc

FILES_${PN} += "${libdir}"

RDEPENDS_${PN} += " \
    python-datetime \
    python-math \
    python-nmap \
"
