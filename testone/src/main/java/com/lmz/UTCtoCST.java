package com.lmz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class UTCtoCST {

  public static void main(String[] args){
    //  UTCtoCST1("2019-11-05T21:02:36.268Z");
    String utc="2019-11-05T21:02:36.268Z";
    ZonedDateTime zdt  = ZonedDateTime.parse(utc);
    LocalDateTime localDateTime = zdt.toLocalDateTime();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
    System.out.println("北京时间："+formatter.format(localDateTime.plusHours(8)));
  }
  /*public static void UTCtoCST1(String utc){    //CST可视为美国、澳大利亚、古巴或中国的标准时间,北京时间与utc时间相差8小时

    ZonedDateTime zdt  = ZonedDateTime.parse(utc);
    LocalDateTime localDateTime = zdt.toLocalDateTime();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
    System.out.println("北京时间："+formatter.format(localDateTime.plusHours(8)));
  }*/
  }



