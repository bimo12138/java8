package com.bimo.optionalExample;

/**
 * @author bimo
 * @version 1.0.0
 * create on    2020-09-2020/9/4 22:23:22
 */
/**
 * Optional 类
 * 作为 容器类 代表一个值存在或者不存在, 可以有效的避免空指针异常
 *     Optional.of(T t)         创建一个 Optional 实例
 *     Optional.empty()         创建以恶空的 Optional 实例
 *     Optional.ofNullable()    如果 t 不是 null，创建 Optional 实例，如果是 null 创建空实例
 *     isPresent()              判断是否包含值
 *     orElse(T t)              如果调用对象包含值【不为空】 则返回该值，否则返回 t
 *     orElseGet(Supplier s)    如果有值则返回值, 如果没有则返回 s 中提供的值
 *     map(Function f)          如果有值对其处理, 返回处理之后的值, 如果没有则返回 Optional.empty()
 *     flatMap(Function mapper) 与 map 类似 ，但是返回值要求的是 Optional
 *
 */

public class main {
}
