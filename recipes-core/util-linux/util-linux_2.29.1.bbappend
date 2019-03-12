#
# back port wait_for_terminal_input from 2.33
# fixes the issue where root is corrupted if you log on quickly
# with a script (you see orot on the log)
#

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0001-back-port-agetty-wait-for-terminal-input-from-2-33.patch"
