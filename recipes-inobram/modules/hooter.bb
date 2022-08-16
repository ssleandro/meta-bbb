require inobram-setuptools.inc
require inobram-manager-setuptools.inc

SRCBRANCH = "master"

RDEPENDS_${PN} += "\
    python3-adafruit-bbio \
    python3-datetime \
"
