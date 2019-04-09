SUMMARY = "Abaco CPLD IRQ Controller Driver"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

inherit module qoriq_build_64bit_kernel

PV = "git+${SRCPV}"
SRCREV = "94e219c265e25a4fd0d2807faf6b8b1ab22d895b"

S = "${WORKDIR}/git"

SRC_URI += "git://github.com/Abaco-Systems/haswell-cpld-intc-module.git"
