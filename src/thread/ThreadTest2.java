package thread;

import org.junit.Test;

/**
 * 线程 实现Runnable
 */
public class ThreadTest2 {
    @Test
    public void t1() {
        HelloThread hello = new HelloThread();
        Thread thread = new Thread(hello);
        thread.start();
    }
}

class HelloThread implements Runnable {
    @Override
    public void run() {
        System.out.println("hello thread");
    }
}

