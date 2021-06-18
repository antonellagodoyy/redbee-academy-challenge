package com.redbee.academy.challenge;

public class CompareNumbers {

  /**
   * Method that receives two numbers and returns the
   * max of both
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @param c - Another Integer Number
   * @return The max of a, b and c
   */
  public static Integer max(Integer a, Integer b, Integer c) {

    Integer[] arrayNum = {a,b,c};

    for (int i = 0; i < arrayNum.length; i++) {
      if (arrayNum[i] == null) {
        arrayNum[i] = 0;
      }
    }

    Integer max = arrayNum[0];

    for (int i = 0; i < arrayNum.length; i++) {
      if (arrayNum[i] > max) {
        max = arrayNum[i];
      }
    }

    return max;
  }
}
