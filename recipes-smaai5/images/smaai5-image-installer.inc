DESCRIPTION = "Image to write the SMAAI5 image to eMMC."
LICENSE = "CLOSE"

# Avoid installation of syslog
BAD_RECOMMENDATIONS += "busybox-syslog"

# Avoid static /dev
USE_DEVFS = "1"

inherit core-image

IMAGE_INSTALL += " \
    smaai5-installer \
    u-boot-script-smaai5-installer \
    \
    base-files \
    base-passwd \
    busybox \
    systemd \
    ${CORE_IMAGE_EXTRA_INSTALL} \
    ${MACHINE_ESSENTIAL_EXTRA_RDEPENDS} \
"

remove_fstab() {
   rm -f ${IMAGE_ROOTFS}/${sysconfdir}/fstab
}

ROOTFS_POSTPROCESS_COMMAND = "copy_smaai5_image_files;remove_fstab;"

IMAGE_FSTYPES = "wic.bmap wic.xz"

WKS_FILE = "smaai5-installer.wks"
