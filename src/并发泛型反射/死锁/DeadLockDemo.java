package 并发泛型反射.死锁;

/**
 * @ClassName DeadLockDemo
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/28 10:00
 */

/**
 * https://www.cnblogs.com/kaituorensheng/p/10633769.html
 * 解析：o1、o2是static类型属于整个类，所以当定义t1、t2时是公用o1、o2的
 * t1设置flag = 1，开始执行，先锁住o1，让后执行 System.out.println("我是" + Thread.currentThread().getName() + "锁住o1");
 * 然后开始睡眠 3秒
 * 此时：
 */


public class DeadLockDemo implements Runnable{


    public DeadLockDemo() {
    }

    public static int flag = 1;
    //static 变量是类对象所共享的
    static Object o1 = new Object();
    static Object o2 = new Object();


    @Override
    public void run() {
        //Thread.currentThread() 返回的是 一个实例。 只不过呢， 这个实例确实比较特殊。 这个实例是当前Thread 的引用
        System.out.println(Thread.currentThread().getName() + ":此时 flag = " + flag);
        if (flag == 1) {
            synchronized (o1) {
                try {
                    System.out.println("我是" + Thread.currentThread().getName() + "锁住o1");
                    Thread.sleep(3000);
                    System.out.println(Thread.currentThread().getName() + "醒来-》准备获取o2");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o2) {
                    System.out.println(Thread.currentThread().getName() + "拿到o2");
                }
            }
        }
        if (flag == 0) {
            synchronized (o2) {
                try {
                    System.out.println("我是" + Thread.currentThread().getName() + "锁住 o2");

                    Thread.sleep(3000);
                    System.out.println(Thread.currentThread().getName() + "醒来->准备获取 o2");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (o1) {

                    synchronized (o1) {

                        System.out.println(Thread.currentThread().getName() + "拿到 o1");
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        DeadLockDemo t1 = new DeadLockDemo();
        DeadLockDemo t2 = new DeadLockDemo();
        t1.flag = 1;
        new Thread(t1).start();


        //让main线程休眠1秒钟，保证开启锁住o2，进入死锁
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.flag = 0;
        new Thread(t2).start();
    }
}
