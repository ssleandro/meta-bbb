DESCRIPTION = "Initramfs to use with remote installer image."
LICENSE = "CLOSED"

IMAGE_FEATURES = "read-only-rootfs"

IMAGE_ROOTFS_SIZE = "8192"
IMAGE_ROOTFS_EXTRA_SPACE = "0"
IMAGE_LINGUAS = ""

BAD_RECOMMENDATIONS += " \
    busybox-syslog \
"

USE_DEVFS = "1"

inherit core-image

CORE_IMAGE_BASE_INSTALL = " \
    base-files \
    base-passwd \
    busybox \
    coreutils \
    netbase \
    udev \
    \
    initramfs-framework-base \
    initramfs-module-remote-installer \
    initramfs-module-udev \
    \
    ${MACHINE_ESSENTIAL_EXTRA_RDEPENDS} \
    ${ROOTFS_BOOTSTRAP_INSTALL} \
"

IMAGE_FSTYPES = "cpio.gz.u-boot"
