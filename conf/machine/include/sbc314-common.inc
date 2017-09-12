# Common machine settings between SBC314 variants

SOURCE_MIRROR_URL ?= "http://git.freescale.com/source/"

JFFS2_ERASEBLOCK = "0x10000"

IMAGE_FSTYPES ?= "tar.gz ext2.gz ext2.gz.u-boot"

MACHINE_EXTRA_RRECOMMENDS += " \
	cpldirqc-module \
	cpldgpio-module \
	udev-extraconf \
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

# Abaco ships u-boot as a seperate release and we can't build
# it in tree as GCC7 is too new for our branch

EXTRA_IMAGEDEPENDS_remove ="u-boot"

JFFS2_ERASEBLOCK = "0x10000"

USE_VT ?= "0"

PREFERRED_PROVIDER_virtual/kernel = "linux-qoriq-abaco"
