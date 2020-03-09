SUMMARY = "Set of i2c tools for linux - Python module"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://smbusmodule.c;startline=1;endline=17;md5=447cbdb60bb98a0a88e812b34dda083f"

DEPENDS += "i2c-tools"

SRC_URI = "\
    http://downloads.yoctoproject.org/mirror/sources/i2c-tools-${PV}.tar.bz2 \
    file://py-smbus-smbusmodule.c-Use-file-from-master-branch.patch \
"

SRC_URI[md5sum] = "7104a1043d11a5e2c7b131614eb1b962"
SRC_URI[sha256sum] = "db5e69f2e2a6e3aa2ecdfe6a5f490b149c504468770f58921c8c5b8a7860a441"

S = "${WORKDIR}/i2c-tools-${PV}/py-smbus/"

inherit distutils
