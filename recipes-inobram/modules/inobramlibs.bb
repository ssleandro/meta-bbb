LICENSE = "CLOSED"

SRCBRANCH ?= "master"
SRC_URI = "git://git@bitbucket.org/inobram/${BPN}.git;branch=${SRCBRANCH};protocol=ssh"

S = "${WORKDIR}/git"

inherit setuptools3

RDEPENDS_${PN} += " \
    inobram-generate-cloud-keys \
    python3-datetime \
    python3-sqlite3 \
"
