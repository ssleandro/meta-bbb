DESCRIPTION = "SMAAI5 Image"

LICENSE = "CLOSED"

inherit core-image extrausers updatehub-image

IMAGE_FEATURES += "package-management ssh-server-openssh"

CORE_IMAGE_EXTRA_INSTALL += " \
    smaai5-base \
    packagegroup-smaai5 \
    \
    connman-client \
    nfs-utils-client \
    nmap \
    ntp \
    ntpdate \
    openssh-sftp-server \
    sudo \
    \
    updatehub-ctl \
    updatehub-local-update \
"

SMAAI5_INOBRAM_PASSWORD = "\$1\$HFywRhHs\$hIAml7WzX1NqRTfUN7Yop/"
SMAAI5_ROOT_PASSWORD = "\$1\$HFywRhHs\$QnMHi9oPLpyR6kxkSxknD0"
EXTRA_USERS_PARAMS = " \
    usermod -p '${SMAAI5_INOBRAM_PASSWORD}' inobram; \
    usermod -p '${SMAAI5_ROOT_PASSWORD}' root; \
"
