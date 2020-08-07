LICENSE = "CLOSED"

IMAGE_FEATURES += "ssh-server-openssh"

inherit core-image extrausers updatehub-image

INOBRAM_INOBRAM_PASSWORD = "\$1\$HFywRhHs\$hIAml7WzX1NqRTfUN7Yop/"
INOBRAM_ROOT_PASSWORD = "\$1\$HFywRhHs\$QnMHi9oPLpyR6kxkSxknD0"
EXTRA_USERS_PARAMS = " \
    usermod -p '${INOBRAM_INOBRAM_PASSWORD}' inobram; \
    usermod -p '${INOBRAM_ROOT_PASSWORD}' root; \
"

BAD_RECOMMENDATIONS += "\
    busybox-syslog \
"

CORE_IMAGE_EXTRA_INSTALL = "\
    packagegroup-inobram-base \
"
