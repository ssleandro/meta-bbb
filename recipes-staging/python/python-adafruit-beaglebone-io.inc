DESCRIPTION = "Adafruit's BeagleBone IO Python Library"
SECTION = "devel/python"
LICENSE = "CLOSED"
SRCNAME = "Adafruit_BBIO"

DEPENDS += "dtc-native"

PYPI_PACKAGE = "Adafruit_BBIO"

SRC_URI[md5sum] = "6a0c286bfb5cb613e25a2e0ffa7da9a7"
SRC_URI[sha256sum] = "6c3a11f9a84653537e09e2e70311b9d3a6f57d98838b2157b9a65ce0f52b4a85"

inherit pypi

# Avoid compilers error with gcc 8.x or later
# https://github.com/adafruit/adafruit-beaglebone-io-python/issues/308
CFLAGS += "-Wno-cast-function-type -Wno-format-truncation -Wno-sizeof-pointer-memaccess -Wno-stringop-overflow"

do_install_append() {
    install -d ${D}/${nonarch_base_libdir}/firmware
    cp ${S}/overlays/*.dtbo ${D}${nonarch_base_libdir}/firmware/
}

FILES_${PN} += "${nonarch_base_libdir}/firmware/*"

PACKAGE_ARCH = "${MACHINE_ARCH}"
