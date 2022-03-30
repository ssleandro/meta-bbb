LICENSE = "CLOSED"

inherit core-image extrausers updatehub-image

IMAGE_FEATURES += "ssh-server-openssh debug-tweaks"

CORE_IMAGE_EXTRA_INSTALL += " \
    ambientte-display-validation \
    packagegroup-ambientte \
    packagegroup-shellhub-runtime \
"
