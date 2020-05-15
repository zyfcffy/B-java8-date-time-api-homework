package com.thoughtworks.capability.gtb;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 脑洞会议系统v5.0 要求打印出的新会议时间为美国中部时区的本地时间
 *
 * @author itutry
 * @create 2020-05-12_23:17
 */
public class Practice4 {

  public static void main(String[] args) {
    String timeStr = "2020-04-01 14:30:00";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    LocalDateTime londonLocal = LocalDateTime.parse(timeStr, formatter);
    ZonedDateTime londonZoned = ZonedDateTime.of(londonLocal, ZoneId.of("Europe/London"));

    ZonedDateTime beijingZoned = londonZoned.withZoneSameInstant(ZoneId.systemDefault());
    LocalDateTime meetingTime = beijingZoned.toLocalDateTime();

    LocalDateTime now = LocalDateTime.now();
    if (now.isAfter(meetingTime)) {
      Period period = Period.between(meetingTime.toLocalDate(), now.toLocalDate());
      Period newPeriod = period.plusDays(1);
      meetingTime = meetingTime.plus(newPeriod);

      String showTimeStr = formatter.format(meetingTime);
      System.out.println(showTimeStr);
    } else {
      System.out.println("会议还没开始呢");
    }
  }
}

