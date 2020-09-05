package com.bimo.methodExampleRef;

/**
 * @author bimo
 * @version 1.0.0
 * create on    2020-09-2020/9/3 18:41:47
 */

/**
 * 方法引用: 如果 Lambda 体中的内容有方法已经实现了，我们可以称之为 "方法引用"
 *
 * 三种格式
 *     对象::实例方法名                两个参数都是 Lambda 的表达式             Object::Method
 *     类::静态方法名
 *     类::实例方法名                  两个参数其中一个作为调用方，另外一个作为参数 ClassName::Method
 * 注意:
 *     1. Lambda 体中调用的方法参数列表与返回值类型，要和函数式接口中抽象方法的函数列表和返回值类型保持一致
 *
 * 构造器引用
 *    new Employee ==> Employee::new
 *
 * 数组引用
 * Type::new             String[]::new
 */
public class main {
}
