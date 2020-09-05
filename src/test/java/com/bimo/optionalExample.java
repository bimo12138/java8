package com.bimo;

import com.bimo.pojo.Employee;
import org.junit.jupiter.api.Test;

import java.util.Optional;

/**
 * @author bimo
 * @version 1.0.0
 * create on    2020-09-2020/9/4 22:24:13
 */
public class optionalExample {
    @Test
    public void v1() {
        Optional<Employee> optional = Optional.of(new Employee());
        // 空指针异常 Optional<Employee> optional = Optional.of(null);
        Employee employee = optional.get();
        System.out.println(employee);
    }

    @Test
    public void v2() {
        Optional<Employee> optional = Optional.ofNullable(null);

        /*
        if (optional.isPresent()) {
            System.out.println(optional.get());
        }
        Employee employee = optional.orElse(new Employee(7, 20));
        System.out.println(employee);
        */
        Employee employee = optional.orElseGet(() -> new Employee(0, 0));
        System.out.println(employee);
    }

    @Test
    public void v3() {
        Optional<Employee> optional = Optional.of(new Employee(0, 0));
        Optional<Integer> integer = optional.map(Employee::getAge);
        System.out.println(integer.get());
    }
}
