package thread;

import org.junit.Test;

/**
 * 线程 继承thread
 */
public class ThreadTest {
    //priority()
    @Test
    public void t3() throws InterruptedException {
        HelloThrad2 thrad = new HelloThrad2();
        thrad.setPriority(Thread.MAX_PRIORITY);
        thrad.start();
        System.out.println("t3 priority:" + Thread.currentThread().getPriority());
    }

    //sleep()
    @Test
    public void t2() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("end");
    }

    //join()
    @Test
    public void t1() throws InterruptedException {
        HelloThrad thrad = new HelloThrad();
        thrad.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("主线程:" + i);
            if (i == 20) {
                thrad.join();
            }
        }
    }

    //创建线程
    public static void main(String[] args) {
        MyTread t1 = new MyTread();
        t1.start();//启动线程
        System.out.println("end");
//        t1.start();//不能重复调用

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }

        //匿名创建
        new Thread() {
            @Override
            public void run() {
                //do something
            }
        }.start();
    }
}

class HelloThrad2 extends Thread {
    @Override
    public void run() {
        System.out.println("hello2 priority:" + this.getPriority());
    }
}

class HelloThrad extends Thread {
    @Override
    public void run() {
        System.out.println("t3 priority:" + this.getPriority());
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + i);
            if (i % 20 == 0) {
                yield();//不太明显
            }
        }
    }
}

class MyTread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}

