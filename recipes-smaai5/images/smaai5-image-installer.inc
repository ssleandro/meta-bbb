DESCRIPTION = "Image to write the SMAAI5 image to eMMC."
LICENSE = "CLOSE"

# Avoid installation of syslog
BAD_RECOMMENDATIONS += "busybox-syslog"

# Avoid static /dev
USE_DEVFS = "1"

inherit core-image

IMAGE_INSTALL += " \
    smaai5-installer \
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
    local file_map=$dest/file-map.sh

    mkdir -p $dest

    # U-Boot and MLO
    cp ${DEPLOY_DIR_IMAGE}/MLO-${MACHINE} $dest/MLO
    echo "MLO=\"/$dest_dirname/MLO\"" >> $file_map
    cp ${DEPLOY_DIR_IMAGE}/u-boot-${MACHINE}.img $dest/u-boot.img
    echo "UBOOT=\"/$dest_dirname/u-boot.img\"" >> $file_map

    ## Rootfs
    cp ${DEPLOY_DIR_IMAGE}/${SMAAI5_INSTALLER_IMAGE_ROOTFS} $dest/
    echo "ROOTFS=\"/$dest_dirname/${SMAAI5_INSTALLER_IMAGE_ROOTFS}\"" >> $file_map
}

ROOTFS_POSTPROCESS_COMMAND = "copy_smaai5_image_files;"

IMAGE_FSTYPES = "wic.bmap wic.xz"
