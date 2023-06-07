require inobram-setuptools.inc

SRCBRANCH = "master"

RDEPENDS:${PN} += "\
    bash    \
    python3-redis \
    python3-gevent \
"
