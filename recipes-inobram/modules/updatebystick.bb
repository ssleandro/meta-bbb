require inobram.inc

SYSTEMD_AUTO_ENABLE = "disable"

RDEPENDS:${PN} += " \
    python3-updatehub-agent-sdk \
    updatehub-sdk-statechange-trigger \
"
