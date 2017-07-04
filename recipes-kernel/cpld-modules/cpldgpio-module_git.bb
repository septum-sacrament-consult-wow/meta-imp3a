SUMMARY = "Abaco CPLD GPIO Driver"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

inherit module qoriq_build_64bit_kernel

PV = "git+${SRCPV}"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

SRC_URI += "git://git@towgit01/mitchellj/cpldgpio.git;protocol=ssh"
