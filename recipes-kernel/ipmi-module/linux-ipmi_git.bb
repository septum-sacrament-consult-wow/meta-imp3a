DESCRIPTION = "user space IPMI implementation for Abaco BMM/BMC operating with a serial port"
LICENSE = "BSD-3-Clause"
PV = "git+${SRCPV}"
S = "${WORKDIR}/git"

LIC_FILES_CHKSUM = "file://${S}/COPYING;md5=3f83e83081872865d115926e2dfb4dba"

SRCREV = "baa5347f528b9eefd03666ff0c8a3fd03ac8d30d"

SRC_URI = "git://git@towgit01/linux/linux-ipmi.git;protocol=ssh;branch=master \
           "

DEPENDS = "lockdev"
RDEPENDS_${PN} = "bash"

do_install_append() {
        install -m 0744 ${S}/setup.bash ${D}${bindir}/abaco-ipmi-setup.bash
}

inherit autotools-brokensep


