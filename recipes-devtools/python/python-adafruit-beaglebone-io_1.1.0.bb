DESCRIPTION = "Adafruit's BeagleBone IO Python Library"
SECTION = "devel/python"
LICENSE = "CLOSED"
SRCNAME = "Adafruit_BBIO"

DEPENDS += "dtc-native"

PYPI_PACKAGE = "Adafruit_BBIO"

SRC_URI[md5sum] = "6457afb1450fd831be1f345df95a7fb6"
SRC_URI[sha256sum] = "f4e78c3c93af52b90129fc01bd006d704e877bcbfaa0b473c6850e4cd09ff26a"

inherit setuptools pypi

do_install_append() {
    install -d ${D}/${nonarch_base_libdir}/firmware
    cp ${S}/overlays/*.dtbo ${D}${nonarch_base_libdir}/firmware/
}

FILES_${PN} += "${nonarch_base_libdir}/firmware/*"

PACKAGE_ARCH = "${MACHINE_ARCH}"
