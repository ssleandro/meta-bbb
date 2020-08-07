SUMMARY = "Smaai5 Remote Installer"
LICENSE = "CLOSED"

SRC_URI = " \
    file://smaai5 \
"

do_install() {
    install -Dm 0755 ${WORKDIR}/smaai5 ${D}/init.d/89-smaai5
}

FILES_${PN} += " \
    /init.d/89-smaai5 \
"

RDEPENDS_${PN} += " \
    bmap-tools \
    wget \
    xz \
"
