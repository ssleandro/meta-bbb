DESCRIPTION = "Fully featured framework for fast, easy and documented API development with Flask"
SECTION = "devel/python"
LICENSE = "CLOSED"

SRC_URI[sha256sum] = "9a5338b108c57fbed1d24d5d53fe98442b2be7ffa2ff3291305af7a613ce6fc0"

inherit pypi setuptools3

RDEPENDS:${PN} += " \
    python3-aniso8601 \
    python3-jsonschema \
    python3-pytz \
"
