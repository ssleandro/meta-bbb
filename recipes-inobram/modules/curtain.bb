require inobram-setuptools.inc
require inobram-manager-setuptools.inc

SRCBRANCH = "master"

RDEPENDS:${PN} += "\
    python3-distutils \
    python3-json \
"
