package com.thoughtworks.capability.gtb;

import java.time.LocalDateTime;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author itutry
 * @create 2020-05-15_16:52
 */
public class Practice2Test {

  @Test
  public void test_method1() {
    final LocalDateTime dateTime = Practice2.method1();
    Assert.assertEquals("2023-03-09T14:38:34", dateTime.toString());
  }

  @Test
  public void test_method2() {
    final LocalDateTime dateTime = Practice2.method2();
    Assert.assertEquals("2023-03-09T14:38:34", dateTime.toString());
  }
}
