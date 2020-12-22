package others.design_patterns.creational.c3_singleton.singleton_1;

/**
 * @description: 懒汉式, 线程不安全
 * @author:zhaojq
 * @date: 2020/5/20
 */
public class Singleton1 {
    private static Singleton1 instance;

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
