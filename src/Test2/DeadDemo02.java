package Test2;

/**
 * @ClassName DeadDemo02
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/2 21:46
 */
public class DeadDemo02 implements Runnable {

    public int flag = 1;

    public void setFlag(int flag) {
        this.flag = flag;
    }
    private static final Object object01 = new Object();
    private static final Object object02 = new Object();

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
                    System.out.println("醒来后，我拿到object02");
                }
            }
        }
        if (flag == 2) {
            synchronized (object02) {
                System.out.println("我拿到了object02，开始区拿object1");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (object01) {
                    System.out.println("我现在拿到了object1");
                }

            }

        }
    }

    public static void main(String[] args) {
        DeadDemo02 deadDemo01 = new DeadDemo02();
        DeadDemo02 deadDemo02 = new DeadDemo02();
        deadDemo01.setFlag(1);
        Thread thread01 = new Thread(deadDemo01, "Thread-01");
        thread01.start();
        Thread thread02 = new Thread(deadDemo02, "Thread-02");
        deadDemo02.setFlag(2);
        thread02.start();
    }
}