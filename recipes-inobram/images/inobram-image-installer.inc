DESCRIPTION = "Image to write the Inobram images to eMMC."
LICENSE = "CLOSED"

# Avoid installation of syslog
BAD_RECOMMENDATIONS += "busybox-syslog"

# Avoid static /dev
USE_DEVFS = "1"

inherit core-image

CORE_IMAGE_EXTRA_INSTALL += " \
    inobram-installer \
"

python() {
    pn = d.getVar('PN').rsplit('-', 1)
    d.setVar("INOBRAM_IMAGE_NAME", pn[0])
}

do_rootfs[depends] += "${INOBRAM_IMAGE_NAME}:do_image_complete"

remove_fstab() {
   rm -f ${IMAGE_ROOTFS}/${sysconfdir}/fstab
}

copy_inobram_image_files() {
    local dest_dirname=installer-data
    local dest=${IMAGE_ROOTFS}/$dest_dirname
    mkdir -p $dest

    cp ${DEPLOY_DIR_IMAGE}/${INOBRAM_IMAGE_NAME}-${MACHINE}.wic.bmap $dest/img.wic.bmap
    cp ${DEPLOY_DIR_IMAGE}/${INOBRAM_IMAGE_NAME}-${MACHINE}.wic.xz $dest/img.wic.xz
}

ROOTFS_POSTPROCESS_COMMAND = "remove_fstab;copy_inobram_image_files;"

WKS_FILE = "${MACHINE}-installer.wks"
