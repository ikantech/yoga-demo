#
# Copyright (c) Facebook, Inc. and its affiliates.
#
# This source code is licensed under the MIT license found in the
# LICENSE file in the root directory of this source tree.
#

cmake_minimum_required(VERSION 3.4.1)

set(CMAKE_VERBOSE_MAKEFILE on)

include_directories(src/main/cpp/)

file(GLOB
    yogacore_SRC
    src/main/cpp/yoga/*.cpp
    src/main/cpp/jni/*.cpp
)

add_library(yoga SHARED ${yogacore_SRC})

target_link_libraries(yoga android log)
