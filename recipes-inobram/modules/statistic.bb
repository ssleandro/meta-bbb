require inobram-setuptools.inc

SRCBRANCH = "master"

RDEPENDS:${PN} += "\
    ${PYTHON_PN}-datetime \
    ${PYTHON_PN}-json \
    ${PYTHON_PN}-sqlite3 \
"
