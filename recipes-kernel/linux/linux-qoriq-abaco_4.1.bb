require recipes-kernel/linux/linux-qoriq_4.1.bb

SRC_URI = "git://git@github.com/Abaco-Systems/linux-qoriq-abaco.git;branch=linux-qoriq-abaco-4.1;nobranch=1"

PV = "4.1+git${SRCPV}"

SRCREV = "776dff8d035a29fcd12dd76a77db80c51f9ef544"

COMPATIBLE_MACHINE = "(sbc314-t1042|sbc314-t2081)"
