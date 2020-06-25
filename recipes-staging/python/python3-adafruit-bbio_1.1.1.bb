DESCRIPTION = "Adafruit's BeagleBone IO Python Library"
SECTION = "devel/python"
LICENSE = "CLOSED"
SRCNAME = "Adafruit_BBIO"

DEPENDS += "dtc-native"

PYPI_PACKAGE = "Adafruit_BBIO"

SRC_URI[md5sum] = "75c676577216244b74958d02900480b5"
SRC_URI[sha256sum] = "9e8255aefb3470706ca2bb63432e4ceb697de2ab1b0be69904456840da0dafd8"

inherit pypi setuptools3

# Avoid compilers error with gcc 8.x or later
# https://github.com/adafruit/adafruit-beaglebone-io-python/issues/308
CFLAGS += "-Wno-cast-function-type -Wno-format-truncation -Wno-sizeof-pointer-memaccess -Wno-stringop-overflow"

do_install_append() {
    install -d ${D}/${nonarch_base_libdir}/firmware
    cp ${S}/overlays/*.dtbo ${D}${nonarch_base_libdir}/firmware/
}

FILES_${PN} += "${nonarch_base_libdir}/firmware/*"

PACKAGE_ARCH = "${MACHINE_ARCH}"
