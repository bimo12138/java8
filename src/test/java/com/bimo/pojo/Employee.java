package com.bimo.pojo;

/**
 * @author bimo
 * @version 1.0.0
 * create on    2020-09-2020/9/3 22:15:32
 */
public class Employee {
    private Integer id;
    private Integer age;

    public Employee() {
    }

    public Employee(Integer id, Integer age) {
        this.id = id;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", age=" + age +
                '}';
    }
}
