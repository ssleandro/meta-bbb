DESCRIPTION = "SMAAI5 Image"

LICENSE = "CLOSED"

inherit core-image extrausers

EXTRA_IMAGE_FEATURES += "package-management ssh-server-openssh"

PYTHON_PKGS = " \
    python-dbus \
    python-debugger \
    python-difflib \
    python-flask \
    python-flask-jsonpify \
    python-flask-jwt \
    python-gevent \
    python-httplib2 \
    python-itsdangerous \
    python-jinja2 \
    python-json \
    python-logging \
    python-markupsafe \
    python-nmap \
    python-numbers \
    python-pickle \
    python-pip \
    python-pkgutil \
    python-pprint \
    python-pybbio \
    python-pyinotify \
    python-pyjwt \
    python-pyserial \
    python-redis \
    python-setuptools \
    python-smbus \
    python-sqlite3 \
    python-subprocess \
    python-unittest \
    python-urllib3 \
    python-werkzeug \
"

CORE_IMAGE_EXTRA_INSTALL += " \
    smaai5-base \
    \
    beaglebone-capes \
    connman-client \
    gadget-init \
    i2c-tools \
    nfs-utils-client \
    nmap \
    ntp \
    ntpdate \
    sqlite3 \
    sudo \
    udisks \
    \
    ${PYTHON_PKGS} \
"

# Add user inobram with password inobram
# Set root password to root
EXTRA_USERS_PARAMS += " \
    useradd -G adm,dialout,cdrom,sudo,audio,video,plugdev,games,users,netdev,input -P %inobram! inobram; \
    usermod -P %inobram! root; \
"
