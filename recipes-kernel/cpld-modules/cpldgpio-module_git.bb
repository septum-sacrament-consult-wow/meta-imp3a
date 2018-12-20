SUMMARY = "Abaco CPLD GPIO Driver"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

inherit module qoriq_build_64bit_kernel

PV = "git+${SRCPV}"
SRCREV = "c4adaba8dd1deed6f591762f2a1068e446ed379c"

S = "${WORKDIR}/git"

SRC_URI += "git://git@towgit01/linux/cpldgpio.git;protocol=ssh"
