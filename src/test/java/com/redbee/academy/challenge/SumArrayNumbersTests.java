package com.redbee.academy.challenge;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SumArrayNumbersTests {

  @Test
  @DisplayName("Tests happy path")
  public void testHappyPath() {
    Integer result = SumArrayNumbers.sum(List.of(1, 2, 3));
    assertNotNull(result, "The result cannot be null");
    assertEquals(6, result);
  }

  @Test
  @DisplayName("Tests happy path")
  public void testHappyPath2() {
    Integer result = SumArrayNumbers.sum(List.of(-9,1,-2));
    assertNotNull(result, "The result cannot be null");
    assertEquals(-10, result);
  }

  @Test
  @DisplayName("Test empty list")
  public void testEmpty() {
    Integer result = SumArrayNumbers.sum(Collections.emptyList());
    assertNotNull(result, "The result cannot be null");
    assertEquals(0, result);
  }
}
