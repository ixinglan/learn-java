package jdk_version.java8.jdk8_02;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TestStreamAPI4 {
    /**
     * 1.给定一个数字列表,如何返回一个由每个数的平方构成的列表?
     * 给定[1,2,3,4,5],返回[1,4,9,16,25]
     */
    @Test
    public void test1() {
        Integer[] nums = new Integer[]{1, 2, 3, 4, 5};
        Arrays.stream(nums).map(n -> n * n).forEach(System.out::println);
    }

    List<Employee> emps = Arrays.asList(
            new Employee(102, "李四", 79, 6666.66, Employee.Status.BUSY),
            new Employee(101, "张三", 18, 9999.99, Employee.Status.FREE),
            new Employee(103, "王五", 28, 3333.33, Employee.Status.VOCATION),
            new Employee(104, "赵六", 8, 7777.77, Employee.Status.BUSY),
            new Employee(104, "赵六", 8, 7777.77, Employee.Status.FREE),
            new Employee(104, "赵六", 8, 7777.77, Employee.Status.FREE),
            new Employee(105, "田七", 38, 5555.55, Employee.Status.BUSY)
    );

    /**
     * map 和reduce方法数一数流中有多少个Employee?
     */
    @Test
    public void test2() {
        Optional<Integer> reduce = emps.stream().map(e -> 1).reduce(Integer::sum);
        System.out.println(reduce.get());
    }
}
