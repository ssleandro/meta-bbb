require smaai5.inc

SYSTEMD_AUTO_ENABLE = "disable"

RDEPENDS_${PN} += " \
    python3-updatehub-agent-sdk \
    updatehub-sdk-statechange-trigger \
"
