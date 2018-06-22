require recipes-smaai5/images/smaai5-image.bb

DESCRIPTION = "SMAAI5 Development Image"

CORE_IMAGE_EXTRA_INSTALL += " \
    bash \
    git \
    htop \
    make \
    openssh-sftp-server \
    tree \
    vim \
"
