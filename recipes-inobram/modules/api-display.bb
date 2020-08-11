require inobram.inc

MODULE_PN = "api_display"

FILES_${PN} += "${libdir}/${MODULE_PN}"

RDEPENDS_${PN} += "\
    python3-flask \
    python3-json \
"
