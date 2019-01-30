#
# Copyright (c) Facebook, Inc. and its affiliates.
#
# This source code is licensed under the MIT license found in the
# LICENSE file in the root directory of this source tree.
#

cmake_minimum_required(VERSION 3.4.1)

set(CMAKE_VERBOSE_MAKEFILE on)

include_directories(src/main/cpp/)
include_directories(src/main/cpp/include)

add_compile_options(
    -fno-omit-frame-pointer
    -fexceptions
    -frtti
    -Wall
    -std=c++11
    -DDISABLE_CPUCAP
    -DDISABLE_XPLAT)

file(GLOB
    yogacore_SRC
    src/main/cpp/*.cpp
    src/main/cpp/yoga/*.cpp
    src/main/cpp/jni/*.cpp
    src/main/cpp/lyra/*.cpp
)

add_library(yoga SHARED ${yogacore_SRC})

target_link_libraries(yoga android log)
