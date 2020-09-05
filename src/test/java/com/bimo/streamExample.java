package com.bimo;

import com.bimo.pojo.Employee;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * @author bimo
 * @version 1.0.0
 * create on    2020-09-2020/9/3 22:13:52
 */
public class streamExample {
    private final List<Employee> employeeList = Arrays.asList(
            new Employee(1, 25),
            new Employee(2, 30),
            new Employee(3, 35),
            new Employee(4, 40),
            new Employee(5, 30)
    );

    @Test
    public void v1() {
        // 中间操作: 只是挂载, 但是并不会立刻的执行
        Stream<Employee> s = employeeList.stream()
                .filter((e) -> e.getAge() > 30);
        // 终止操作, 一次性执行全部内容, 包括上面的流操作
        s.forEach(System.out::println);
    }

    @Test
    public void v2() {
        List<String> list = Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee");
        list.stream().map(String::toUpperCase)
                .forEach(System.out::println);
    }

    @Test
    public void v3() {
        boolean b1 = employeeList.stream()
                .allMatch(e -> e.getAge() > 25);
        System.out.println("年龄都大于 25 吗？ \t" + b1);
        boolean b2 = employeeList.stream()
                .anyMatch(e -> e.getAge() > 40);
        System.out.println("年龄有一个大于 40 的吗? \t" + b2);
        boolean b3 = employeeList.stream()
                .noneMatch(e -> e.getAge() < 25);
        System.out.println("年龄没有一个小于 25 的? \t" + b3);

        Optional<Employee> employee = employeeList.stream()
                .sorted(Comparator.comparingInt(Employee::getAge))
                .findFirst();
        System.out.println("年龄最小是: " + employee);

        Optional<Employee> employee1 = employeeList.stream()
                .filter(e -> e.getAge() == 30)
                .findAny();
        System.out.println("年龄为 30 的员工是: " + employee1);
    }

    @Test
    public void v4() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Integer sum = list.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }

    @Test
    public void v5() {
        List<Integer> collect = employeeList.stream()
                .map(Employee::getAge)
                .collect(Collectors.toList());
        collect.forEach(System.out::println);
    }

    @Test
    public void v6() {
        Instant start = Instant.now();
        LongStream.rangeClosed(0, 10000000000L)
                .parallel()
                .reduce(0, Long::sum);
        Instant end = Instant.now();
        System.out.println("耗费的时间为: " + Duration.between(start, end).toMillis());
    }
}
