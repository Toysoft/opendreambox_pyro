SUMMARY = "OpenDreambox: Base Task for the OpenDreambox Distribution"
SECTION = "opendreambox/base"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${OPENDREAMBOX_BASE}/LICENSE;md5=0a5ec7423edaca24547634f416478834"
PR = "r23"

inherit packagegroup

RDEPENDS_${PN} += " \
  distro-feed-configs \
  dropbear \
  killall \
  openresolv \
  opkg \
  parted \
  procps \
  tpmd \
  tuxbox-common \
  tzdata \
  vsftpd \
  xfsprogs-mkfs \
"

RRECOMMENDS_${PN} += " \
  autofs \
  avahi-daemon \
  dccamd \
  e2fsprogs-e2fsck \
  libpagecache \
  mc \
  sambaserver \
  zeroconf \
"
