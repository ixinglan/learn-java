package jdk_version.java12;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 垃圾回收器等
 */
public class Test {

    //数字格式压缩
    @org.junit.Test
    public void t1() {
        var cnf = NumberFormat.getCompactNumberInstance(Locale.CHINA, NumberFormat.Style.SHORT);
        System.out.println(cnf.format(1_0000));
        System.out.println(cnf.format(1_9200));
        System.out.println(cnf.format(1_000_000));
        System.out.println(cnf.format(1L << 30));
        System.out.println(cnf.format(1L << 40));
        System.out.println(cnf.format(1L << 50));
    }

    //String: transform
    @org.junit.Test
    public void t2() {
        var result = "foo".transform(input -> input + " bar");
        System.out.println(result); // foo bar

        var result2 = "foo".transform(input -> input + " bar").transform(String::toUpperCase);
        System.out.println(result2); // FOO BAR

        System.out.println("======test java 12 transform======");
        List<String> list1 = List.of("Java", " Python", " C++ ");
        List<String> list2 = new ArrayList<>();
        list1.forEach(element -> list2.add(element.transform(String::strip).transform(String::toUpperCase).transform((e) -> "Hi," + e)));
        list2.forEach(System.out::println);

        System.out.println("======test before java 12 ======");
        List<String> list11 = List.of("Java ", " Python", " C++ ");
        Stream<String> stringStream = list11.stream().map(element -> element.strip()).map(String::toUpperCase).map(element -> "Hello," + element);
        List<String> list22 = stringStream.collect(Collectors.toList());
        list22.forEach(System.out::println);
    }

    //String: indent 该方法允许我们调整String实例的缩进
    @org.junit.Test
    public void t3() {
        System.out.println("======test java 12 indent======");
        String result = "Java\n Python\nC++".indent(3);
        System.out.println(result);

        /* 输出如下
        ======test java 12 indent======
           Java
            Python
           C++
         */
    }

    //Files: mismatch 返回首次不匹配的position,完全不匹配返回-1
    @org.junit.Test
    public void t4() throws IOException {
        FileWriter fileWriter = new FileWriter("src/jdk_version/java12/a.txt");
        fileWriter.write("a");
        fileWriter.write("b");
        fileWriter.write("c");
        fileWriter.close();
        FileWriter fileWriterB = new FileWriter("src/jdk_version/java12/b.txt");
        fileWriterB.write("a");
        fileWriterB.write("1");
        fileWriterB.write("c");
        fileWriterB.close();
        System.out.println(Files.mismatch(Path.of("src/jdk_version/java12/a.txt"), Path.of("src/jdk_version/java12/b.txt")));
    }
}
