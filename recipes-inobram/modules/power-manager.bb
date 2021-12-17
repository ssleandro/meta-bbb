require inobram-setuptools.inc

# Disable in development stage
SYSTEMD_AUTO_ENABLE_${PN} = "enable"

# As Power Manager doesn't have PN-control.socket we need to override the
# inobram_install task from inobram-setuptools.inc
inobram_install() {
    install -Dm 0644 ${S}/etc/${PN}.service ${D}${systemd_system_unitdir}/${PN}.service
}

RDEPENDS_${PN} += "python3-smbus2"
