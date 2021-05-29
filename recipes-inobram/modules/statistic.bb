require inobram-setuptools.inc

SRCBRANCH = "ambientte_1.0.x"

RDEPENDS_${PN} += "\
    ${PYTHON_PN}-datetime \
    ${PYTHON_PN}-json \
    ${PYTHON_PN}-sqlite3 \
"
