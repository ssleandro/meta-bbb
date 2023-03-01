require inobram.inc

SRC_URI = "git://git@bitbucket.org/inobram/display.git;branch=${SRCBRANCH};protocol=ssh"

SYSTEMD_SERVICE:${PN} = "display.service"
SYSTEMD_SERVICE:${PN} = "display.timer"

FILES:${PN} += "${libdir}"

RDEPENDS:${PN} += " \
    nmap \
    python3-datetime \
    python3-math \
    python3-nmap \
    python3-spidev \
"
