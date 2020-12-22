package others.design_patterns.creational.c3_singleton.singleton_4;

/**
 * @description: 登记式/静态内部类
 * @author:zhaojq
 * @date: 2020/5/20
 */
public class Singleton {
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    private Singleton() {
    }

    public static final Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
