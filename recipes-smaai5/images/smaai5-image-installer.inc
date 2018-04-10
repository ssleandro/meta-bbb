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

copy_smaai5_image_files() {
    local dest_dirname=installer-data
    local dest=${IMAGE_ROOTFS}/$dest_dirname
    mkdir -p $dest

    cp ${DEPLOY_DIR_IMAGE}/${SMAAI5_INSTALLER_IMAGE_ROOTFS}.wic.bmap $dest/img.wic.bmap
    cp ${DEPLOY_DIR_IMAGE}/${SMAAI5_INSTALLER_IMAGE_ROOTFS}.wic.xz $dest/img.wic.xz
}

remove_fstab() {
   rm -f ${IMAGE_ROOTFS}/${sysconfdir}/fstab
}

ROOTFS_POSTPROCESS_COMMAND = "copy_smaai5_image_files;remove_fstab;"

IMAGE_FSTYPES = "wic.bmap wic.xz"

WKS_FILE = "smaai5-installer.wks"
