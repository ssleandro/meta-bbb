SUMMARY = "Base configuration for SMAAI5"

LICENSE = "CLOSED"

DEPENDS = "connman"

inherit useradd

USERADD_PACKAGES =  "${PN}"
USERADD_PARAM_${PN} = "-p '*' -G adm,dialout,sudo,plugdev,users,netdev,input inobram"

RDEPENDS_${PN} += "connman"

ALLOW_EMPTY_${PN} = "1"
