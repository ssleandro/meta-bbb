require inobram-setuptools.inc
require inobram-manager-setuptools.inc

SRCBRANCH = "ambientte_1.0.x"

RDEPENDS_${PN} += " \
   ${PYTHON_PN}-datetime \
   ${PYTHON_PN}-json \
   ${PYTHON_PN}-requests \
   ${PYTHON_PN}-sqlite3 \
   sqlite3 \
"
