require recipes-kernel/linux/linux-qoriq_4.1.bb

SRC_URI = "git://git@github.com/Abaco-Systems/linux-qoriq-abaco.git;branch=linux-qoriq-abaco-4.1;nobranch=1"

PV = "4.1+git${SRCPV}"

SRCREV = "3467a98c14e78ee9269cb0079d43d3d5d40a449e"

COMPATIBLE_MACHINE = "(sbc314-t1042|sbc314-t2081)"
