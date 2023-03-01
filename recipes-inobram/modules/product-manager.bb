require inobram-setuptools.inc

SRCBRANCH = "master"

RDEPENDS:${PN} += "\
    python3-redis \
    python3-gevent \
"
