DESCRIPTION = "bootloader for Pocket Beagle & BeagleBone"
require recipes-bsp/u-boot/u-boot.inc

DEPENDS += "bc-native dtc-native"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=a2c678cfd4a4d97135585cad908541c6"
PE = "1"

# We use the revision in order to avoid having to fetch it from the
# repo during parse
SRCREV = "890e79f2b1c26c5ba1a86d179706348aec7feef7"

SRC_URI = "git://git.denx.de/u-boot.git"

S = "${WORKDIR}/git"PROVIDES += "u-boot"

SRC_URI = "git://git.denx.de/u-boot.git"

S = "${WORKDIR}/git"
