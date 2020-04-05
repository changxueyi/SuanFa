package Test2;

/**
 * @ClassName DeadDemo
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/2 8:56
 */
public class DeadDemo implements Runnable {
    public static final Object object1 = new Object();
    public static final Object object2 = new Object();
    public int flag = 1;

    public void setFlag(int flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag == 1) {
            synchronized (object1) {
                System.out.println("拿到object1，flag=1开始执行");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (object2) {
                    System.out.println("准备获得object2");
                }
            }
        }
        if (flag == 2) {
            synchronized (object2) {
                System.out.println("拿到了object2，flag=2开始执行");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (object1) {
                    System.out.println("准备获得object1");
                }
            }
        }
    }

    public static void main(String[] args) {
        DeadDemo deadDemo1 = new DeadDemo();
        DeadDemo deadDemo2 = new DeadDemo();

        deadDemo1.setFlag(1);
        Thread thread1 = new Thread(deadDemo1, "Thread1");
        thread1.start();

        deadDemo2.setFlag(2);
        Thread thread2 = new Thread(deadDemo2, "Thread2");
        thread2.start();
    }
}