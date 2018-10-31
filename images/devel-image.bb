SUMMARY = "Devel image"

IMAGE_FEATURES += "package-management"
IMAGE_LINGUAS = "en-us"

inherit core-image

DEV_SDK = " \
	binutils \
	binutils-symlinks \
	gcc \
	gcc-symlinks \
	libstdc++ \
	libstdc++-dev \
	make \
	ldd \
	python3-modules \
	vim \
"

IMAGE_INSTALL += "${DEV_SDK} \
"

export IMAGE_BASENAME = "devel-image"
