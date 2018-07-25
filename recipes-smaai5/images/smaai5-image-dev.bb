require recipes-smaai5/images/smaai5-image.bb

IMAGE_FEATURES += "package-management"

DESCRIPTION = "SMAAI5 Development Image"

CORE_IMAGE_EXTRA_INSTALL += " \
    bash \
    make \
    openssh-sftp-server \
    tree \
    vim \
"
