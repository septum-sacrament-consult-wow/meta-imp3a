# Common machine settings between SBC314 variants

SOURCE_MIRROR_URL ?= "http://git.freescale.com/source/"

JFFS2_ERASEBLOCK = "0x10000"

IMAGE_FSTYPES ?= "tar.gz ext2.gz ext2.gz.u-boot"

MACHINE_EXTRA_RRECOMMENDS += " \
        cpldirqc-module \
        cpldgpio-module \
"

XSERVER = " \
        mesa-driver-swrast \
        xf86-video-modesetting \
	xf86-video-fbdev \
	xf86-video-ati \
        xf86-input-evdev \
        xf86-input-keyboard \
        xf86-input-mouse \
	xserver-xorg \
        xserver-xorg-extension-glx \
"

UBOOT_MACHINES ?= "SBC314_PRI SBC314_SEC"

UBOOT_CONFIG ??= "nand sdcard spi secure-boot nor"
UBOOT_CONFIG[nor] = "T1042D4RDB_config"
UBOOT_CONFIG[nand] = "T1042D4RDB_NAND_config,,u-boot-with-spl-pbl.bin"
UBOOT_CONFIG[sdcard] = "T1042D4RDB_SDCARD_config,,u-boot-with-spl-pbl.bin"
UBOOT_CONFIG[spi] = "T1042D4RDB_SPIFLASH_config,,u-boot-with-spl-pbl.bin"
UBOOT_CONFIG[secure-boot] = "T1042D4RDB_SECURE_BOOT_config"

JFFS2_ERASEBLOCK = "0x10000"

USE_VT ?= "0"
