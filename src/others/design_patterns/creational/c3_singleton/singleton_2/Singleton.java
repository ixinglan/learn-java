package others.design_patterns.creational.c3_singleton.singleton_2;

/**
 * @description: 饿汉式, 线程安全
 * @author:zhaojq
 * @date: 2020/5/20
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }
}
