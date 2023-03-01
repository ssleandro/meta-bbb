require inobram-image.inc

DESCRIPTION = "Ambientte Image"

inherit populate_sdk_qt5

TOOLCHAIN_TARGET_TASK:remove = "packagegroup-qt5-toolchain-target"
TOOLCHAIN_TARGET_TASK:append = " \
    packagegroup-core-standalone-sdk-target \
    qtbase-dev \
    qtbase-mkspecs \
    qtbase-plugins \
    qtbase-staticdev \
    qtbase-tools \
"

SYSTEMD_DEFAULT_TARGET = "graphical.target"

CORE_IMAGE_EXTRA_INSTALL += "\
    packagegroup-ambientte \
    packagegroup-ambientte-modules \
"
