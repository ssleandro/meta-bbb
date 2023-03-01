require inobram-image-installer.inc

do_rootfs[depends] += "smaai5-image-2gb:do_image_complete"

copy_inobram_image_files:append() {
    cp ${DEPLOY_DIR_IMAGE}/smaai5-image-2gb-${MACHINE}.wic.bmap $dest/img-2gb.wic.bmap
    cp ${DEPLOY_DIR_IMAGE}/smaai5-image-2gb-${MACHINE}.wic.xz $dest/img-2gb.wic.xz
}
