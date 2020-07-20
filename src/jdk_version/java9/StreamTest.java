package jdk_version.java9;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @description:
 * @author:zhaojq
 */
public class StreamTest {

    //takeWhile: 返回从开头开始的尽量多的元素,一旦满足,后面的全不要
    @Test
    public void t1() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 6, 4, 7, 9, 8);
        Stream<Integer> stream = list.stream();
        stream.takeWhile(x -> x < 5).forEach(System.out::println);
    }

    //dropWhile 与takeWhile相反,互补,一旦不满足,后面的全都要
    @Test
    public void t2() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 6, 4, 7, 9, 8);
        Stream<Integer> stream = list.stream();
        stream.dropWhile(x -> x < 5).forEach(System.out::println);
    }

    //ofNullable: ofNullable 方法允许我们创建一个单元素 Stream，可以包含一个非空元素，也可以创建一个空 Stream。
    @Test
    public void t3() {
        Stream<Integer> stream1 = Stream.of(1, 2, null);
        stream1.forEach(System.out::println);

//        Stream<Object> stream2 = Stream.of(null);//报 NullPointerException

        //ofNullable()：允许值为 null
        Stream<Object> stream3 = Stream.ofNullable(null);
        System.out.println(stream3.count());//0

        Stream<String> stream4 = Stream.ofNullable("hello world");
        System.out.println(stream4.count());//1

    }

    //重载的 iterate
    @Test
    public void t4() {
        Stream.iterate(0, x -> x + 1).limit(10).forEach(System.out::println);

        Stream.iterate(0, x -> x < 10, x -> x + 1).forEach(System.out::println);
    }

    //optional 的stream
    @Test
    public void t5() {
        List<String> list = new ArrayList<>();
        list.add("Jerry");
        list.add("Tim");
        Optional<List<String>> optional = Optional.ofNullable(list);
        Stream<List<String>> stream = optional.stream();
        stream.flatMap(x -> x.stream()).forEach(System.out::println);
    }

}
