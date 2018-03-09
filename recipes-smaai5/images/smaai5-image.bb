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

# Add user inobram with password inobram
# Set root password to root
EXTRA_USERS_PARAMS += " \
    useradd -G adm,dialout,cdrom,sudo,audio,video,plugdev,games,users,netdev,input -P %inobram! inobram; \
    usermod -P %inobram! root; \
"
