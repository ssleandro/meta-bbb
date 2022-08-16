require inobram-setuptools.inc

SRCBRANCH = "master"

RDEPENDS_${PN} += "\
    ${PYTHON_PN}-datetime \
    ${PYTHON_PN}-json \
    ${PYTHON_PN}-sqlite3 \
"
