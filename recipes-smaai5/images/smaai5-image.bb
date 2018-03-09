DESCRIPTION = "SMAAI5 Image"

LICENSE = "CLOSED"

inherit core-image extrausers

IMAGE_FEATURES += "package-management ssh-server-openssh"

CORE_IMAGE_EXTRA_INSTALL += " \
    smaai5-base \
    packagegroup-smaai5 \
    \
    beaglebone-capes \
    connman-client \
    gadget-init \
    i2c-tools \
    nfs-utils-client \
    nmap \
    ntp \
    ntpdate \
    sudo \
    udisks \
"

SMAAI5_PASSWORD = "\$1\$HFywRhHs\$hIAml7WzX1NqRTfUN7Yop/"
EXTRA_USERS_PARAMS = "usermod -p '${SMAAI5_PASSWORD}' inobram;"
