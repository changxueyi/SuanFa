package Test2;

/**
 * @ClassName DeadDemo03
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/3 10:24
 */
public class DeadDemo03 implements Runnable {
    private static final Object object01 = new Object();
    private static final Object object02 = new Object();
    public int flag = 1;

    public void setFlag(int flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag == 1) {
            synchronized (object01) {
                System.out.println(Thread.currentThread().getName() + ":拿到了object01");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (object02) {
                    System.out.println("我醒了，拿到了object02");
                }
            }
        }
        if (flag == 2) {
            synchronized (object02) {
                System.out.println(Thread.currentThread().getName() + ":拿到了object02");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (object01) {
                    System.out.println("我醒了，拿到了object01");
                }
            }
        }
    }

    public static void main(String[] args) {
        //很懵逼，下面这样写测试，为啥就不是一个死锁
        DeadDemo03 a1 = new DeadDemo03();
        DeadDemo03 b1 = new DeadDemo03();
        a1.setFlag(1);
        Thread thread01 = new Thread(a1, "thead-01");
        thread01.start();

        Thread thread02 = new Thread(b1, "thead-02");
        b1.setFlag(2);
        thread02.start();
        //下面注释这个就可以运行死锁成功，仅仅定义的名字不同，上面的就不是死锁，自动释放了
       /* DeadDemo03 deadDemo01 = new DeadDemo03();
        DeadDemo03 deadDemo02 = new DeadDemo03();
        deadDemo01.setFlag(1);
        Thread thread01 = new Thread(deadDemo01, "Thread-01");
        thread01.start();
        Thread thread02 = new Thread(deadDemo02, "Thread-02");
        deadDemo02.setFlag(2);
        thread02.start();*/

    }

}