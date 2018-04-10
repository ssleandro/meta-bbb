do_rootfs[depends] += "smaai5-image-dev:do_image_complete"

SMAAI5_INSTALLER_IMAGE_ROOTFS = "smaai5-image-dev-${MACHINE}"

require smaai5-image-installer.inc
