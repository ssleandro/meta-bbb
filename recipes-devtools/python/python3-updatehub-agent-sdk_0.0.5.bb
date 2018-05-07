require python-updatehub-agent-sdk.inc
inherit setuptools3

RDEPENDS_${PN} += " \
    python3-enum \
    python3-selectors \
    python3-signal \
"
