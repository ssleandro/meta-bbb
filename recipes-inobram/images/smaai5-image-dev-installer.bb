do_rootfs[depends] += "smaai5-image-dev:do_image_complete"

SMAAI5_INSTALLER_IMAGE_ROOTFS = "smaai5-image-dev-${MACHINE}"

require smaai5-image-installer.inc

copy_smaai5_image_files() {
    local dest_dirname=installer-data
    local dest=${IMAGE_ROOTFS}/$dest_dirname
    mkdir -p $dest

    cp ${DEPLOY_DIR_IMAGE}/${SMAAI5_INSTALLER_IMAGE_ROOTFS}.wic.bmap $dest/img.wic.bmap
    cp ${DEPLOY_DIR_IMAGE}/${SMAAI5_INSTALLER_IMAGE_ROOTFS}.wic.xz $dest/img.wic.xz
}
