package com.thoughtworks.capability.gtb;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * 对任意日期获取下一个工作日, 不考虑节假日
 *
 * @author itutry
 * @create 2020-05-15_17:20
 */
public class Practice2 {

    public static LocalDate getNextWorkDate(LocalDate date) {
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int day = dayOfWeek.getValue();
        if (day == 5) {
            date = date.plusDays(3);
        } else if (day == 6) {
            date = date.plusDays(2);
        } else {
            date = date.plusDays(1);
        }
        return date;
    }
}
