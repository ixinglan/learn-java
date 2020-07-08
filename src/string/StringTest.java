package string;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @description:
 * @author:zhaojq
 */
public class StringTest {
    @Test
    public void t8() {

    }

    @Test
    public void t7() throws UnsupportedEncodingException {
        //string -> byte[]
        //byte[] -> string
        String s1 = "abc123ABC赵";
        byte[] chars = s1.getBytes("gbk");
        System.out.println(Arrays.toString(chars));

        String s2 = new String(chars, "gbk");
        System.out.println(s2);
        System.out.println(s1 == s2);
    }

    @Test
    public void t6() {
        //string -> char[]
        //char[] -> string
        String s1 = "abc123";
        char[] chars = s1.toCharArray();
        for (char aChar : chars) {
            System.out.println(aChar);
        }

        String s2 = new String(chars);
        System.out.println(s2);
        System.out.println(s1 == s2);
    }

    @Test
    public void t5() {
        //常用方法
        String s1 = "abc";
        String s2 = "abd";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.contains("bc"));
    }

    @Test
    public void t4() {
        StringTest test = new StringTest();
        test.change(test.str, test.ch);
        System.out.println(test.str);//good
        System.out.println(test.ch);//best

        //值传递,引用类型传地址,基础类型传数据
    }

    String str = new String("good");
    char[] ch = {'t', 'e', 's', 't'};

    public void change(String str, char ch[]) {
        str = "test ok";
        ch[0] = 'b';
    }

    @Test
    public void t3() {
        /**
         * 常量与常量拼接,结果在常量池中
         * 只要有一个是亦是,结果就在堆中
         * 拼接结果调用intern(),结果就在常量池中
         */
        String s1 = "javaEE";
        String s2 = "hadoop";
        String s3 = "javaEEhadoop";
        String s4 = "javaEE" + "hadoop";
        String s5 = s1 + "hadoop";
        String s6 = "javaEE" + s2;
        String s7 = s1 + s2;
        System.out.println(s3 == s4);//true
        System.out.println(s3 == s5);
        System.out.println(s3 == s6);
        System.out.println(s3 == s7);
        System.out.println(s5 == s6);
        System.out.println(s5 == s7);
        System.out.println(s6 == s7);

        String s8 = s5.intern();
        System.out.println(s3 == s8);//true
    }

    @Test
    public void t2() {
        //保存在常量池中
        String s1 = "abc";
        String s2 = "abc";
        //保存在堆空间中
        String s3 = new String("abc");
        String s4 = new String("abc");

        System.out.println(s1 == s2);//true
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s3 == s4);

        Person p1 = new Person("tom", 1);
        Person p2 = new Person("tom", 1);
        System.out.println(p1.name.equals(p2.name));
        System.out.println(p1.name == p2.name);//true,字面量赋值都保存在常量池中

        p1.name = "su";
        System.out.println(p2.name);

        //String s= new String("abc") 创建了两个对象,1个堆空间中new的,1个常量池中对应的char[]
    }

    /**
     * 1.final的,不可被继承
     * 2.实现Serializable接口,可被序列化,实现Comparable接口,可比较大小
     * 3.内部定义了final char[],存储数据
     * 4.不可变字符序列:不可变性
     * - 对串重新赋值时,需重写指定内存区域赋值,不能使用原有value进行赋值
     * - 对串进行连接操作时,同上
     * - 调用replace方法修改时,同上
     * 5.通过字面量赋值(区别于new),此时字符串声明在字符串常量池中
     * 6.字符串常量池是不会存储相同内容的字符串的
     */
    @Test
    public void t1() {
        String s1 = "abc";
        String s2 = "abc";

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 = s2);

        String s3 = "abc";
        s3 += "def";
        System.out.println(s3);

        String s4 = s3.replace('a', 'e');
        System.out.println(s4);
    }
}
