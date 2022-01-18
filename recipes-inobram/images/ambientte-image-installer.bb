require inobram-image-installer.inc

do_rootfs[depends] += "u-boot-script-ambientte-installer:do_deploy"

copy_inobram_image_files_append() {
    cp ${DEPLOY_DIR_IMAGE}/${UBOOT_BINARY} $dest/${UBOOT_BINARY}
}

IMAGE_BOOT_FILES = " \
    boot-installer.scr-${MACHINE};boot.scr \
    boot-installer.scr-${MACHINE};boot-tezi.scr \
"
