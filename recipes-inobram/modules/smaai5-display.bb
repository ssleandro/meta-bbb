require inobram-setuptools.inc

SRC_URI = "git://git@bitbucket.org/inobram/display.git;branch=${SRCBRANCH};protocol=ssh"

inobram_install:append() {
    install -Dm 0644 ${S}/etc/${PN}.service ${D}${systemd_system_unitdir}/${PN}.timer
}

FILES:${PN} += "${systemd_system_unitdir}/*"

RDEPENDS:${PN} += " \
    nmap \
    python3-datetime \
    python3-math \
    python3-nmap \
    python3-spidev \
"
