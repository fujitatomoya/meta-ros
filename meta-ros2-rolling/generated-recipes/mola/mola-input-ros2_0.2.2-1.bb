# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "RawDataSource acting as a bridge: ROS2 -&gt; MOLA"
AUTHOR = "Jose-Luis Blanco-Claraco <joseluisblancoc@gmail.com>"
ROS_AUTHOR = "Jose-Luis Blanco-Claraco <joseluisblancoc@gmail.com>"
HOMEPAGE = "https://github.com/MOLAorg/"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "mola"
ROS_BPN = "mola_input_ros2"

ROS_BUILD_DEPENDS = " \
    ament-cmake-xmllint \
    ament-lint-auto \
    ament-lint-common \
    geometry-msgs \
    mola-common \
    mola-kernel \
    mrpt2 \
    nav-msgs \
    rclcpp \
    ros-environment \
    sensor-msgs \
    tf2 \
    tf2-geometry-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-gmock-native \
    ament-cmake-gtest-native \
    ament-cmake-native \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
    geometry-msgs \
    mola-common \
    mola-kernel \
    mrpt2 \
    nav-msgs \
    rclcpp \
    sensor-msgs \
    tf2 \
    tf2-geometry-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
    geometry-msgs \
    mola-common \
    mola-kernel \
    mrpt2 \
    nav-msgs \
    rclcpp \
    sensor-msgs \
    tf2 \
    tf2-geometry-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/mola-release/archive/release/rolling/mola_input_ros2/0.2.2-1.tar.gz
ROS_BRANCH ?= "branch=release/rolling/mola_input_ros2"
SRC_URI = "git://github.com/ros2-gbp/mola-release;${ROS_BRANCH};protocol=https"
SRCREV = "78aeb15c6f4e4dff148e1b01416276e17632b26f"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
