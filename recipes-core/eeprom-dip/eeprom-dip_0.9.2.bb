DESCRIPTION = "user space IPMI implementation for Abaco BMM/BMC operating with a serial port"
LICENSE = "GPLv2"
S = "${WORKDIR}/git"

#avoid GNU_HASH error in Bitbake
TARGET_CC_ARCH += "${LDFLAGS}"


LIC_FILES_CHKSUM = "file://${S}/COPYING;md5=fcb02dc552a041dee27e4b85c7396067"

SRCREV = "e5ed9466d280699b0b98e0ad4509cfcac9913fb1"

SRC_URI = "git://git@towgit01/stever/eeprom-dip.git;protocol=ssh;branch=master \
           "

do_install_append() {
        install -d -m 755 ${D}/usr/share/man/man1/
        install -m 0644 ${S}/eeprom-dip.1 ${D}/usr/share/man/man1
        install -d -m 755 ${D}/${bindir}
	install -m 0755 ${S}/eeprom-dip   ${D}/${bindir}
        install -d -m 755 ${D}/etc
	install -m 0644 ${S}/sbc314-dip.conf ${D}/etc/abaco-dip.conf
}


FILES_${PN} = " /usr/share/man/man1/eeprom-dip.1 ${bindir}/eeprom-dip /etc/abaco-dip.conf "

