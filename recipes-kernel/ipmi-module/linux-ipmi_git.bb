DESCRIPTION = "user space IPMI implementation for Abaco BMM/BMC operating with a serial port"
LICENSE = "BSD-3-Clause"
PV = "git+${SRCPV}"
S = "${WORKDIR}/git"
inherit manpages

LIC_FILES_CHKSUM = "file://${S}/COPYING;md5=3f83e83081872865d115926e2dfb4dba"

SRCREV = "7253a1ac5965c3bef291e35d659b2a8ed6eec069"

SRC_URI = "git://github.com/Abaco-Systems/ipmi-linux.git;branch=master \
           "

DEPENDS = "lockdev"
RDEPENDS_${PN} = "bash"

do_install_append() {
        install -m 0744 ${S}/setup.bash ${D}${bindir}/abaco-ipmi-setup.bash
}

inherit autotools-brokensep



