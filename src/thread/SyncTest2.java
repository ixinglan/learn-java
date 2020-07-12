package thread;

/**
 * 线程同步
 * 同步代码块: 操作共享数据的代码,即为需要被同步的代码
 * synchronized(对象){
 * //go sth
 * }
 */
public class SyncTest2 {
    public static void main(String[] args) {
        Window2 t1 = new Window2();
        Window2 t2 = new Window2();
        Window2 t3 = new Window2();


        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();

    }

}

//处理继承Thread类接口的纯种安全
class Window2 extends Thread {
    private static int ticket = 100;

    private static Object obj = new Object();

    @Override
    public void run() {

        while (true) {
            //正确的
//            synchronized (obj){
            synchronized (Window2.class) {//Class clazz = Window2.class,Window2.class只会加载一次
                //错误的方式：this代表着t1,t2,t3三个对象
//              synchronized (this){
                if (ticket > 0) {

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(getName() + "：卖票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }

        }

    }
}
