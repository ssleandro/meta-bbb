require inobram-setuptools.inc
require inobram-manager-setuptools.inc

SRCBRANCH = "ambientte_1.0.x"

RDEPENDS_${PN} += "\
    python3-adafruit-bbio \
    python3-datetime \
"
