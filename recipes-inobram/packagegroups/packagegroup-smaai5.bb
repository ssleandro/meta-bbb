SUMMARY = "SMAAI5 Package Group"
LICENSE = "CLOSED"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

PROVIDES = "${PACKAGES}"

PACKAGES = "\
    packagegroup-smaai5 \
    packagegroup-smaai5-modules \
"

RDEPENDS_packagegroup-smaai5 = "\
    smaai5-base \
    smaai5-updatehub-device-attributes \
    connman-client \
"

RDEPENDS_packagegroup-smaai5-modules = "\
    adc \
    airflow \
    alarm \
    buzzer \
    co2 \
    curtain \
    disarm \
    exhauster \
    heater \
    hooter \
    hour \
    inlet \
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
    rtc \
    scale \
    sensation \
    setting \
    smaai5-display \
    statistic \
    stick \
    synchronizer \
    timer \
    updatebystick \
    watcher \
    web \
"
