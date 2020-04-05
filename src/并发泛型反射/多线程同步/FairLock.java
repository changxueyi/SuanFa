package 并发泛型反射.多线程同步;

import sun.plugin.javascript.navig.FrameArray;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName FairLock
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/2 14:38
 */
public class FairLock implements Runnable{
    public static ReentrantLock fairLock = new ReentrantLock(true);

    @Override
    public void run() {
        while (true){
            try{
                fairLock.lock();
                System.out.println(Thread.currentThread().getName()+"获得锁");
            }finally {
                fairLock.unlock();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException{
        FairLock fairLock = new FairLock();
        Thread t1 = new Thread(fairLock,"Thread_t1");
        Thread t2 = new Thread(fairLock,"Thread_t2");
        t1.start();
        t2.start();
    }

}