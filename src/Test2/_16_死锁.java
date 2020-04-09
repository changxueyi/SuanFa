package Test2;

/**
 * @ClassName _16_死锁
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/6 16:31
 */
public class _16_死锁 implements Runnable {
    private static Object o1 = new Object();
    private static Object o2 = new Object();
    private int flag = 1;

    public void setFlag(int flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag == 1) {
            synchronized (o1) {
                System.out.println(Thread.currentThread().getName() + ":拿到了01");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o2) {
                    System.out.println(Thread.currentThread().getName() + "醒来拿到了o2");
                }
            }
        }
        if (flag == 2) {
            synchronized (o2) {
                System.out.println(Thread.currentThread().getName() + ":拿到了02");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o1) {
                    System.out.println(Thread.currentThread().getName() + "醒来拿到了o1");
                }
            }
        }
    }

    public static void main(String[] args) {
        _16_死锁 dead1 = new _16_死锁();
        _16_死锁 dead2 = new _16_死锁();
        dead1.setFlag(1);
        Thread thread01 = new Thread(dead1,"thread01");
        thread01.start();
        dead2.setFlag(2);
        Thread thread02 = new Thread(dead2,"thread02");
        thread02.start();
    }
}