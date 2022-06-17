require inobram-setuptools.inc

SRCBRANCH = "ambientte_1.0.x"

SYSTEMD_AUTO_ENABLE = "enable"

RDEPENDS_${PN} += " \
    inobram-generate-cloud-keys \
    python3-asn1crypto \
    python3-certifi \
    python3-cffi \
    python3-chardet \
    python3-cryptography \
    python3-decorator \
    python3-gevent \
    python3-greenlet \
    python3-idna \
    python3-objectpath \
    python3-paho-mqtt \
    python3-ply \
    python3-pycparser \
    python3-pyjwt \
    python3-redis \
    python3-requests \
    python3-six \
    python3-zopeinterface \
"
