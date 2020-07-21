package jdk_version.java9;

/**
 * String：jdk 8 及之前：底层使用char[]存储；jdk 9 : 底层使用byte[] (encoding flag)
 * StringBuffer:jdk 8 及之前：底层使用char[]存储；jdk 9 : 底层使用byte[]
 * StringBuilder:jdk 8 及之前：底层使用char[]存储；jdk 9 : 底层使用byte[]
 * <p>
 * String：不可变的字符序列；
 * StringBuffer:可变的字符序列；线程安全的，效率低；
 * StringBuilder:可变的字符序列；线程不安全的，效率高（jdk 5.0)
 */
public class StringTest {
}