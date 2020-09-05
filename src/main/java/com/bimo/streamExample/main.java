package com.bimo.streamExample;

/**
 * @author bimo
 * @version 1.0.0
 * create on    2020-09-2020/9/3 20:50:38
 */


/**
 * Stream 创建的三个步骤
 *     1. 创建 Stream
 *         通过 Collections.stream() 系列集合提供的 stream() [串行流] 或者 parallelStream() [并行流] 创建的 stream
 *         通过 Arrays 中的静态方法 stream() 获取数据流
 *         通过 Stream 中的静态方法 of()
 *         创建无限流
 *     2. 中间操作
 *     3. 终止操作
 *
 * 内部迭代
 * Stream 的中间操作
 *     1. filter   -- 接收 Lambda ，从流中排除某些元素
 *     2. limit    -- 截断流，让其中的元素不超过指定的数量
 *     3. skip(n)  -- 跳过元素, 跳过了前 n 个元素，如果整个长度低于 n 则返回一个空的
 *     4. distinct -- 去重, 通过计算元素的 hashCode() 和 equals() 去除重复元素
 * Stream 存在多个中间操作组成流水线, 除非触发终止操作，否则中间操作不会执行任何的处理，
 * 但是如果在终止操作中一次性全部处理，称为 "惰性求职"
 *
 * 短路: 只会执行到需求的条数, 不会和单独使用 limit 的效果一样, 便利全局
 * xxx.filter((e) -> {
 *     ${action();}
 *     return ${condition}
 * }).limit(n)
 *
 *
 * 映射
 * map -- 接收 Lambda, 将元素转换为其他形式或提取信息.接收一个函数作为参数,该函数会被应用到每个元素上,
 * 并将其映射到一个新的元素上,并成为以恶新的元素
 * flatmap 能够将几个小的流 合并成一个大的流 【也就是把几个小的数组转化为一个大的数组】
 * list.addAll() --> flatMap()
 *
 * sorted() 自然排序
 * sorted(Comparator comparator) 定制排序
 *
 *
 * 终止操作
 *     1. 查找与匹配
 *         allMatch()    观察流中的元素是否全都满足某条件
 *         anyMatch()    观察流中的元素是否有一个满足条件
 *         noneMatch()   检查是否没有匹配的元素【一个都不是】 如果有一个满足条件则返回 false
 *         findFirst()   返回第一个元素
 *         findAny()     返回当前选择的任意元素
 *         count()       返回流中元素的个数
 *         max()         返回流中的最大值
 *         min()         返回流中的最小值
 *
 *     2. 规约 将流中的元素反复结合起来，得到一个值
 *         reduce()
 *     3. 收集 将流转化为其他的形式 接收一个 Collector 接口的实现可以实现元素的汇总方法   HashMap::new  toList()
 *         1. 普通的转换
 *         2. 分组      Collectors.groupingBy()
 *         3. 多级分组   Collectors.groupingBy(getData, Collectors.groupingBy())
 *         4. 分区      Collectors.partitioningBy()
 *         NOTE: DoubleSummaryStatistics dss = Collectors.summarizingDouble(action); 之后可以使用
 *               dss.getSum() || dss.getAverage() || dss.getMax() 等方法
 *         5. 字符串连接 Collectors.joining(", "， start, end) 每个之间都会添加 , 链接 去首尾, 首尾 params[2 || 3] 指定
 *
 *  并行流
 *  Fork / Join 框架: 把一个大的任务进行 拆分[fork] 成若干个小任务, 然后对于运算结果进行 汇总[join] 操作
 *  线程窃取: 当前线程的任务队列 获取不到任务 或者 任务完成之后, 会到其他忙碌线程的任务队列，队尾获取任务拿到自己的任务队列
 *  .parallel()
 */
public class main {
}
