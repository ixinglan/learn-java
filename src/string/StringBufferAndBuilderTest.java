package string;

import org.junit.Test;

/**
 * @description:
 * @author:zhaojq
 */
public class StringBufferAndBuilderTest {
    @Test
    public void t3() {
        //效率对比
        //StringBuilder>StringBuffer>String
        long stime = 0l;
        long etime = 0l;
        StringBuffer buffer = new StringBuffer("");
        StringBuilder builder = new StringBuilder("");
        String str = "";

        stime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            buffer.append(String.valueOf(i));
        }
        etime = System.currentTimeMillis();
        System.out.println("buffer:" + (etime - stime));

        stime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            builder.append(String.valueOf(i));
        }
        etime = System.currentTimeMillis();
        System.out.println("builder:" + (etime - stime));

        stime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            str += i;
        }
        etime = System.currentTimeMillis();
        System.out.println("str:" + (etime - stime));

    }

    @Test
    public void t2() {
        StringBuffer s1 = new StringBuffer("abcde");
        s1.reverse();
        System.out.println(s1);
    }

    /**
     * new String();//new char[0]
     * new String("abc");//new char[3]{'a','b','c'}
     * <p>
     * new StringBuffer();//new char[16];底层创建了一个长度是16的数组
     * new StringBuffer("abc");//new char['abc'.length+16];
     */
    @Test
    public void t1() {
        //可变
        StringBuffer buffer1 = new StringBuffer("abc");
        buffer1.setCharAt(0, 'm');
        System.out.println(buffer1);
        System.out.println(buffer1.length());

        StringBuffer buffer2 = new StringBuffer();
        System.out.println(buffer2.length());
    }
}
