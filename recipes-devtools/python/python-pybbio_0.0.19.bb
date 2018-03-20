DESCRIPTION = "Adafruit's BeagleBone IO Python Library"
SECTION = "devel/python"
LICENSE = "CLOSED"
SRCNAME = "Adafruit_BBIO"

DEPENDS += "dtc-native"

SRC_URI = "git://github.com/robinsonsantos/Adafruit_BBIO.git"
SRCREV = "b090e114810c7167b88b02329c5e34e766934986"

S = "${WORKDIR}/git"

inherit setuptools

do_install_append() {
    install -d ${D}/${nonarch_base_libdir}/firmware
    cp ${S}/overlays/*.dtbo ${D}${nonarch_base_libdir}/firmware/
}

FILES_${PN} += "${nonarch_base_libdir}/firmware/*"

PACKAGE_ARCH = "${MACHINE_ARCH}"
