DESCRIPTION = "Linux kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

inherit kernel siteinfo

S = "${WORKDIR}/git"

PV = "4.14.25+git${SRCPV}"

SRCBRANCH = "4.14"
SRCREV = "13475158ff04f4f3e9dfe7aee50af8ec44b9b21b"
SRC_URI = " \
    git://github.com/beagleboard/linux.git;branch=${SRCBRANCH} \
    file://defconfig \
"
