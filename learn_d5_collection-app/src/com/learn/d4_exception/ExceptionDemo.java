package com.learn.d4_exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * 运行时异常
 * 编译时异常
 */
public class ExceptionDemo {
    public static void main(String[] args) throws ParseException {


        try {

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d = sdf.parse("2020-11-12 12:13:33");
            System.out.println(d);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }

}
