package com.thoughtworks.capability.gtb;

import java.time.LocalDate;

/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */
public class Practice1 {

  public static long getDaysBetweenNextLaborDay(LocalDate date) {
    int dateOfYear = date.getYear();
    LocalDate nextLaborDay = LocalDate.of(dateOfYear, 5, 1);
    if (date.isAfter(nextLaborDay)) {
      nextLaborDay = nextLaborDay.plusYears(1);
    }
    return nextLaborDay.toEpochDay() - date.toEpochDay();
  }
}
