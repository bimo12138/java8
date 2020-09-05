package com.bimo;

import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

/**
 * @author bimo
 * @version 1.0.0
 * create on    2020-09-2020/9/5 11:30:24
 */
public class LocalDateTimeExample {
    @Test
    public void v1() {
        LocalDateTime t1 = LocalDateTime.now();
        System.out.println("当前时间为: " + t1);
        LocalDateTime t2 = LocalDateTime.of(2020, 1, 1, 1, 1, 1);
        System.out.println("2020年开始的时间为: " + t2);
        LocalDateTime t3 = t1.plusYears(1);
        System.out.println("今天的一年后: " + t3);
        LocalDateTime t4 = t1.minusYears(1);
        System.out.println("今天的一年前: " + t4);
        System.out.println("今天的月份: " + t1.getMonth());
    }

    @Test
    public void v2() {
        // UTC 时区
        Instant i1 = Instant.now();
        System.out.println(i1);

        OffsetDateTime i2 = i1.atOffset(ZoneOffset.ofHours(8));
        System.out.println(i2);
         // 输出毫秒
        System.out.println(i1.toEpochMilli());
    }

    @Test
    public void v3() {
        DateTimeFormatter f1 = DateTimeFormatter.ISO_DATE;
        LocalDateTime t1 = LocalDateTime.now();
        String s1 = t1.format(f1);
        System.out.println(s1);

        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("yyyyMMdd HH mm ss");
        String s2 = t1.format(f2);
        System.out.println(s2);

        LocalDateTime t3 = t1.parse(s2, f2);
        System.out.println(t3);
    }
}
