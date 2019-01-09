DESCRIPTION = "user space IPMI implementation for Abaco BMM/BMC operating with a serial port"
LICENSE = "BSD-3-Clause"
PV = "git+${SRCPV}"
S = "${WORKDIR}/git"

LIC_FILES_CHKSUM = "file://${S}/COPYING;md5=3f83e83081872865d115926e2dfb4dba"

SRCREV = "9ed4acdeebb5588d8fdfda9f294f502bc27eaec3"

SRC_URI = "git://git@towgit01/linux/linux-ipmi.git;protocol=ssh;branch=master \
           "

DEPENDS = "lockdev"
RDEPENDS_${PN} = "bash"

do_install_append() {
        install -m 0744 ${S}/setup.bash ${D}${bindir}/abaco-ipmi-setup.bash
}

inherit autotools-brokensep


