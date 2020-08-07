require inobram-image.inc

DESCRIPTION = "SMAAI5 Image"

CORE_IMAGE_EXTRA_INSTALL += " \
    packagegroup-smaai5 \
    packagegroup-smaai5-modules \
"

create_empty_uboot_config() {
	# create empty configuration file used in wks as rawcopy
	dd if=/dev/zero of=${DEPLOY_DIR_IMAGE}/uboot-empty-config bs=1k count=64
}

ROOTFS_POSTPROCESS_COMMAND += " create_empty_uboot_config;"
