package 并发泛型反射.多线程同步.轮流打印;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName MyThreadLock
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/3 17:16
 */
public class MyThreadLock implements Runnable{
    private int no;

    private static ReentrantLock lock = new ReentrantLock();

    private static Condition condition = lock.newCondition();

    private static int count;

    public MyThreadLock(int no){
        this.no = no;
    }



    @Override
    public void run() {
        while (true){
            lock.lock();
            if (count>100){
                break;
            }else {
                if (count%3 == this.no){
                    System.out.println(this.no+"-->"+count);
                    count++;
                }else {
                    try {
                        condition.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            condition.signalAll();
            lock.unlock();
        }
    }
}