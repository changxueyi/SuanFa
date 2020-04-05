package 并发泛型反射.死锁;

/**
 * @ClassName DeadLockDemo02
 * @Description 说明
 * o1、o2是static类型属于整个累，所以当定义deadLock1、deadLock2时是公用o1、o2的
 * deadLock1设置flag=1，先锁住o1，然后睡800ms，此时
 * deadLock2设置flag=2，先锁住o2，然后睡800ms
 * 然后deadLock1开始锁o2,不过o2还被deadLock2锁着，只好等待。。。
 * 此时deadLock1开始锁01，不过o1还被deadLock1锁着，只好等待。。。
 * 相互等待造成死锁
 * <p>
 * <p>
 * 产生死锁的四个必要条件：
 * 互斥：一个资源每次只能被一个进程使用
 * 资源保持：一个进程被阻塞时，不释放已有资源
 * 不可抢占：正在使用的资源不能被剥夺
 * 循环等待：循环等待未被分配的资源
 * @Author changxueyi
 * @Date 2020/4/1 22:26
 */
public class DeadLockDemo02 implements Runnable {
    private int flag = 1;
    private static final Object o1 = new Object();
    private static final Object o2 = new Object();

    public void setFlag(int flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag == 1) {
            synchronized (o1) {
                System.out.println(Thread.currentThread().getName() + " o1");
                try {
                    Thread.sleep(800);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o2) {
                    System.out.println(Thread.currentThread().getName() + " o2");
                }
            }
        }
        if (flag == 2) {
            synchronized (o2) {
                System.out.println(Thread.currentThread().getName() + " o2");
                try {
                    Thread.sleep(800);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o1) {
                    System.out.println(Thread.currentThread().getName() + " o1");
                }
            }
        }
    }

    public static void main(String[] args) {
        DeadLockDemo02 deadLock1 = new DeadLockDemo02();
        DeadLockDemo02 deadLock2 = new DeadLockDemo02();

        deadLock1.setFlag(1);
        Thread thread1 = new Thread(deadLock1, "Thread1");
        thread1.start();

        deadLock2.setFlag(2);
        Thread thread2 = new Thread(deadLock2, "Thread2");
        thread2.start();
    }
}