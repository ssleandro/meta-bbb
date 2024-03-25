SUMMARY = "SMAAI5 Package Group"
LICENSE = "CLOSED"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

PROVIDES = "${PACKAGES}"

PACKAGES = "\
    packagegroup-smaai5 \
    packagegroup-smaai5-modules \
"

RDEPENDS:packagegroup-smaai5 = "\
    connman \
    connman-client \
    libgpiod-python \
    libiio-python3 \
    python3-periphery \
    python3-spidev \
    inobram-base \
    smaai5-updatehub-device-attributes \
"

RDEPENDS:packagegroup-smaai5-modules = "\
    adc \
    actuators \
    airflow \
    alarm \
    batch \
    buzzer \
    co2 \
    curtain \
    disarm \
    exhauster \
    heater \
    hooter \
    hour \
    inlet \
    inobramlibs \
    interface-api \
    inverter \
    lot \
    modbusfans \
    nebulizer \
    ngrok \
    poweroff \
    probe \
    reading \
    redis \
    relay \
    report-alarm \
    scale \
    sensation \
    settings \
    smaai5-display \
    statistic \
    timer \
    update-manager \
    usb-manager \
    watcher \
"
