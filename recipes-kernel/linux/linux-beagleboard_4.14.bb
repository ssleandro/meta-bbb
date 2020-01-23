DESCRIPTION = "Linux kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

inherit kernel siteinfo

S = "${WORKDIR}/git"

PV = "4.14.108-ti-r126"

SRC_URI = " \
    git://github.com/beagleboard/linux.git;nobranch=1;tag=${PV} \
    file://defconfig \
"
