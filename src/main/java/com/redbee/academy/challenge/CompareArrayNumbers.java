package com.redbee.academy.challenge;

import java.util.ArrayList;
import java.util.List;

public class CompareArrayNumbers {

  /**
   * Method that receives two lists and returns
   * another list with de max of each index
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @return The result of a + b
   */

  public static List<Integer> max(List<Integer> a, List<Integer> b) {
    Integer maxLength = Math.max(a.size(), b.size());
    Integer minLength = Math.min(a.size(), b.size());
    ArrayList<Integer> maxOfBothLists = new ArrayList<>();

    for (int i = 0; i < maxLength; i++) {
      Integer value;
      if ( i < minLength ){
        value = Math.max(a.get(i), b.get(i));
      }else {
        value = (a.size() > b.size())?a.get(i):b.get(i);
      }
      maxOfBothLists.add(value);
    }
    return maxOfBothLists;
  }
}
