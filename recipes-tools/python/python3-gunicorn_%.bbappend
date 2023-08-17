FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " \
    file://0001-About-gunicorn-[CRITICAL]-Worker-Timeout.patch \
    file://0002-Update-gunicorn-workers-workertmp.patch \
"
