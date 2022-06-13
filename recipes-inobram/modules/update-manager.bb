require inobram-setuptools.inc

SYSTEMD_AUTO_ENABLE = "enable"

RDEPENDS_${PN} = "\
    python3-datetime \
    python3-gevent \
    python3-json \
    python3-redis \
"
