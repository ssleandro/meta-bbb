SUMMARY = "Inobram Package Group"
LICENSE = "CLOSED"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

PROVIDES = "${PACKAGES}"

PACKAGES = "\
    packagegroup-inobram-base \
    packagegroup-inobram-development \
"

RDEPENDS:packagegroup-inobram-base = "\
    bash \
    git \
    htop \
    less \
    packagegroup-shellhub-runtime \
    procps \
    python3-speedtest-cli \
    redis \
    sqlite3 \
    sudo \
    tzdata-americas \
    tzdata-core \
    updatehub-ctl \
"

RDEPENDS:packagegroup-inobram-development = "\
    curl \
    gdbserver \
    git \
    make \
    nano \
    openssh-sftp-server \
    python3-pip \
    python3-profile \
    python3-repo \
    python3-wheel \
    socat \
    systemd-analyze \
    tree \
    vim \
"
