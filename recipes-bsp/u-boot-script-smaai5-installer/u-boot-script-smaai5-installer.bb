SUMMARY = "SMAAI5 Boot Script"
LICENSE = "CLOSED"

SRC_URI = "file://uEnv.txt"

do_install() {
    install -Dm 0644 ${WORKDIR}/uEnv.txt ${D}/boot/uEnv.txt
}

FILES:${PN} += "/boot/uEnv.txt"
