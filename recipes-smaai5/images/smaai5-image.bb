DESCRIPTION = "SMAAI5 Image"

LICENSE = "CLOSED"

inherit core-image extrausers updatehub-image

IMAGE_FEATURES += "ssh-server-openssh"

BAD_RECOMMENDATIONS += " \
    busybox-syslog \
"

CORE_IMAGE_EXTRA_INSTALL += " \
    smaai5-base \
    packagegroup-smaai5 \
    \
    bash \
    connman-client \
    git \
    htop \
    less \
    sudo \
    systemd-analyze \
    \
    updatehub-ctl \
"

SMAAI5_INOBRAM_PASSWORD = "\$1\$HFywRhHs\$hIAml7WzX1NqRTfUN7Yop/"
SMAAI5_ROOT_PASSWORD = "\$1\$HFywRhHs\$QnMHi9oPLpyR6kxkSxknD0"
EXTRA_USERS_PARAMS = " \
    usermod -p '${SMAAI5_INOBRAM_PASSWORD}' inobram; \
    usermod -p '${SMAAI5_ROOT_PASSWORD}' root; \
"

create_empty_uboot_config() {
	# create empty configuration file used in wks as rawcopy
	dd if=/dev/zero of=${DEPLOY_DIR_IMAGE}/uboot-empty-config bs=1k count=64
}

ROOTFS_POSTPROCESS_COMMAND += \
	"create_empty_uboot_config;"
