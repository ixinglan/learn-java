package jdk_version.java11;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @description:
 * @author:zhaojq
 */
public class StringTest {
    //string
    @Test
    public void t1() {
        String s = "\t \r\n";
        System.out.println(s.isBlank());//是否空白

        s = "\t \r\n abc \t";
        System.out.println("---------------------");
        String s1 = s.strip();//去除首尾空白, trim()只能去除英文空格,strip()能去除任何空白字符
        System.out.println(s1);
        System.out.println(s1.length());//0
        System.out.println("---------------------");
        s.stripTrailing();//去除尾部
        s.stripLeading();//去除首部

        System.out.println("---------------------");
        "java".repeat(3);//复制
        System.out.println("---------------------");
        "A\nB\nC".lines().count(); // 行数统计
    }

    //inputStream
    @Test
    public void t2() throws IOException {
        var classLoader = this.getClass().getClassLoader();
        var inputStream = classLoader.getResourceAsStream("jdk_version/java11/javastack");
        try (var outputStream = new FileOutputStream("src/jdk_version/java11/javastack2")) {
            inputStream.transferTo(outputStream);
        }
        inputStream.close();
    }
}
