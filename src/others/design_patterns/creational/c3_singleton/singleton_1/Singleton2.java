package others.design_patterns.creational.c3_singleton.singleton_1;

/**
 * @description: 懒汉式, 线程不安全
 * @author:zhaojq
 * @date: 2020/5/20
 */
public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2() {
    }

    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
