package juc.juc_01;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * @description: aba问题
 * @author:zhaojq
 * @date: 2020/7/3
 */
public class ABA {
    private static AtomicInteger atomicInt = new AtomicInteger(100);
    private static AtomicStampedReference atomicStampedRef = new AtomicStampedReference(100, 0);

    public static void main(String[] args) throws InterruptedException {
        Thread intT1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("进入 intT1-------------");
                atomicInt.compareAndSet(100, 101);
                atomicInt.compareAndSet(101, 100);
                System.out.println("执行完 intT1-------------");
            }
        });

        Thread intT2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("进入 intT2-------------");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                }
                boolean c3 = atomicInt.compareAndSet(100, 101);
                System.out.println(c3); // true
                System.out.println("执行完 intT2-------------");
            }
        });

        intT1.start();
        intT2.start();
        intT1.join();
        intT2.join();

        Thread refT1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("进入 refT1-------------");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                }
                boolean c1 = atomicStampedRef.compareAndSet(100, 101, atomicStampedRef.getStamp(), atomicStampedRef.getStamp() + 1);
                boolean c2 = atomicStampedRef.compareAndSet(101, 100, atomicStampedRef.getStamp(), atomicStampedRef.getStamp() + 1);
                System.out.println("c1:" + c1);
                System.out.println("c2:" + c2);
                System.out.println("执行完 refT1-------------");
            }
        });

        Thread refT2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("进入 refT2-------------");
                int stamp = atomicStampedRef.getStamp();
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                }
                boolean c3 = atomicStampedRef.compareAndSet(100, 101, stamp, stamp + 1);
                System.out.println("c3:" + c3); // false
                System.out.println("执行完 refT2-------------");
            }
        });

        refT1.start();
        refT2.start();
    }
}
