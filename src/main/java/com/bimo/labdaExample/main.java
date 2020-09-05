package com.bimo.labdaExample;

/**
 * @author bimo
 * @version 1.0.0
 * create on    2020-09-2020/9/3 13:27:03
 */

import java.util.function.Function;

/**
 * Lambda 表达式
 * Java8 中引入了 "->" 操作符 箭头操作符、Lambda 操作符
 * 左侧 Lambda 表达式的参数列表
 * 右侧 Lambda 表达式中需要执行的功能 【Lambda 体】
 * 语法格式
 *     1. params None return None   () -> System.out.println("Hello Lambda");
 *     2. params 1    return None   (x) -> System.out::println;
 *     3. params 1    return None   x -> System.out::println;                 [小括号可以省略]
 *     4. params 2    return Yes    (x, y) -> {};        [后面是存在分号的, 如果Lambda 中只有一句,那么大括号和return都可以省略]
 *     5. params
 *
 * Lambda 类型可以省略是因为 Java 编译器 可以进行 "类型推断" [Java8 特性]
 *
 * 函数式接口：如果接口中只有一个抽象方法的接口，那么它就是函数式接口
 * 可以使用 @FunctionalInterface 修饰 【可以检查这个接口是否是函数式接口】
 * JAVA8 内置 四大核心的函数式接口
 *     Consumer<T>    消费型接口  void accept(T t);
 *     Supplier<T>    供给型接口  T get();
 *     Function<T, R> 函数型接口  R apply(T t);
 *     Predicate<T>   断言型接口  boolean test(T t);
 *
 * 其他的函数式接口
 *     NAME                TARGET DESCRIPTION                                     METHOD
 *     BiFunction<T, U>     R     对于 T U 参数应用操作，返回 R 类型                   R apply(T t, U u)
 *     UnaryOperator<T>     T     对于 T 类型进行一元运算, 并且返回 T 类型              T apply(T t)
 *     BinaryOperator<T, T> T     对于 T 类型进行一元运算, 并且返回 T 类型的结果         T apply(T t1, T t2)
 *     BiConsumer<T, U>     void  对于 两个参数 进行操作                              void accept(T t, U u)
 *     ToIntFunction<T>     int  分别计算int long double 的值
 *     ToLongFunction<T>    long
 *     ToDoubleFunction<T>  double
 *     IntFunction<R>
 *     LongFunction<R>
 *     DoubleFunction<R>
 */
public class main {

}
