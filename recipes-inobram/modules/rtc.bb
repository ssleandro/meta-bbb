require inobram.inc

SRCBRANCH = "ambientte_1.0.x"

RDEPENDS_${PN} += " \
    i2c-tools \
    python3-smbus \
"
