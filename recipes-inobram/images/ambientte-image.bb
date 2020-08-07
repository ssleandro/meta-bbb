require inobram-image.inc

DESCRIPTION = "Ambientte Image"

SYSTEMD_DEFAULT_TARGET = "graphical.target"

CORE_IMAGE_EXTRA_INSTALL += "\
    packagegroup-ambientte \
    packagegroup-ambientte-modules \
"
