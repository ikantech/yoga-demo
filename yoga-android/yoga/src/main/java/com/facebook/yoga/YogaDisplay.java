/*
 *  Copyright (c) Facebook, Inc.
 *
 *  This source code is licensed under the MIT license found in the LICENSE
 *  file in the root directory of this source tree.
 *
 */
package com.facebook.yoga;

import com.facebook.yoga.annotations.DoNotStrip;

@DoNotStrip
public enum YogaDisplay {
  FLEX(0),
  NONE(1);

  private final int mIntValue;

  YogaDisplay(int intValue) {
    mIntValue = intValue;
  }

  public int intValue() {
    return mIntValue;
  }

  public static YogaDisplay fromInt(int value) {
    switch (value) {
      case 0: return FLEX;
      case 1: return NONE;
      default: throw new IllegalArgumentException("Unknown enum value: " + value);
    }
  }
}
