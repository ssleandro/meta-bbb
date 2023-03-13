require inobram-setuptools.inc

SYSTEMD_AUTO_ENABLE = "enable"

# Override the function existent in inobram-setuptools,
# because this package doesn't provides the socket service.
inobram_install() {
    install -Dm 0644 ${S}/etc/${PN}.service ${D}${systemd_system_unitdir}/${PN}.service
}

RDEPENDS:${PN} += " \
    python3-datetime \
    python3-json \
    python3-updatehub-agent-sdk \
"
