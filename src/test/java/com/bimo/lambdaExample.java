package com.bimo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author bimo
 * @version 1.0.0
 * create on    2020-09-2020/9/3 13:47:13
 */
public class lambdaExample {

    @Test
    public void v1() {
        Runnable r = () -> System.out.println("Hello Lambda");
        r.run();
    }

    @Test
    public void v2() {
        Consumer<String> consumer = System.out::println;
        consumer.accept("Hello My Params");
    }

    @Test
    public void v3() {
        Comparator<Integer> comparator = (x, y) -> {
            System.out.println("Lambda Comparable");
            return Integer.compare(x, y);
        };
    }

    public void happy(double money, Consumer<Double> consumer) {
        consumer.accept(money);
    }

    @Test
    public void v4() {
        happy(10000, (money) -> System.out.printf("消费了 %s 元", money));
    }

    /**
     * Supplier 提供者接口
     * @param num 获取随机数的数目
     * @param supplier 提供者的接口
     * @return 返回随机数的结果
     */
    public List<Integer> getNumList(int num, Supplier<Integer> supplier) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            Integer n = supplier.get();
            list.add(n);
        }
        return list;
    }

    @Test
    public void v5() {
        List<Integer> list = getNumList(5, () -> (int)(Math.random() * 100));
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }

    /**
     * Function 接口 实现处理方法
     * @param str   raw 字符串
     * @param func  功能
     * @return      返回值
     */
    public String strHandler(String str, Function<String, String> func) {
        return func.apply(str);
    }

    @Test
    public void v6() {
        String newStr = strHandler("  /t/t/t Lambda Supply ", String::trim);
        System.out.println(newStr);
    }

    public List<String> filterStr(List<String> list, Predicate<String> predicate) {
        List<String> strings = new ArrayList<>();
        for (String string : list) {
            if (predicate.test(string))
                strings.add(string);
        }
        return strings;
    }

    @Test
    public void v7() {
        List<String> list = Arrays.asList("hello", "template", "flag");
        List<String> strList =  filterStr(list, (str) -> str.length() > 4);
        for (String s : strList) {
            System.out.println(s);
        };
    }
}
