require inobram-setuptools.inc

SRCBRANCH = "master"

RDEPENDS_${PN} += "\
    python3-redis \
    python3-gevent \
"
