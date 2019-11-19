package com.lmz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TimestamptoCST {

  public static void main(String[] args){
    String timestamp="1573005471783";
    SimpleDateFormat format = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss.SSS" );
    Long time=new Long(timestamp);
    String d = format.format(time);
    System.out.println(d);
  }


}
