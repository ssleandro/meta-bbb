SUMMARY = "Inobram Package Group"
LICENSE = "CLOSED"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

PROVIDES = "${PACKAGES}"

PACKAGES = "\
    packagegroup-inobram-base \
    packagegroup-inobram-development \
"

RDEPENDS_packagegroup-inobram-base = "\
    bash \
    git \
    htop \
    less \
    packagegroup-shellhub-runtime \
    python3-speedtest-cli \
    redis \
    sqlite3 \
    sudo \
    updatehub-ctl \
"

RDEPENDS_packagegroup-inobram-development = "\
    git \
    make \
    nano \
    openssh-sftp-server \
    python3-repo \
    systemd-analyze \
    tree \
    vim \
"
