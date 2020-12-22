package others.design_patterns.creational.c3_singleton.singleton_3;

/**
 * @description: 双检锁/双重校验锁（DCL，即 double-checked locking）
 * @author:zhaojq
 * @date: 2020/5/20
 */
public class Singleton {
    private volatile static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
