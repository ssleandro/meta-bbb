require inobram-setuptools.inc

SRCBRANCH = "ambientte_1.0.x"

# As rtcg doesn't have PN-control.socket we need to override the
# inobram_install task from inobram-setuptools.inc
inobram_install() {
    install -Dm 0644 ${S}/etc/${PN}.service ${D}${systemd_system_unitdir}/${PN}.service
}

RDEPENDS_${PN} += " \
    i2c-tools \
    python3-smbus \
"
