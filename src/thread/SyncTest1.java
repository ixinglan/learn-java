package thread;

/**
 * 线程同步
 * 同步代码块: 操作共享数据的代码,即为需要被同步的代码
 * synchronized(对象){
 * //go sth
 * }
 */
public class SyncTest1 {
    public static void main(String[] args) {
        Window1 w = new Window1();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }

}

//处理实现Runnable接口的纯种安全
class Window1 implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + ":卖票，票号为：" + ticket);

                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}
