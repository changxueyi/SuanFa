package 并发泛型反射.多线程同步.轮流打印;

/**
 * @ClassName MyThread
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/3 17:11
 */
public class MyThread implements Runnable {
    private static Object lock = new Object();
    private static int count = 0;
    int no;

    public MyThread(int no) {
        this.no = no;
    }

    @Override
    public void run() {
        while (true){
            synchronized (lock){
                if (count>100){
                    break;
                }
                //这个位置 上次遇到问题，耽误了半个小时
                if (count%3==this.no){
                    System.out.println(this.no+"-->"+count);
                    count++;
                }else {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                lock.notifyAll();
            }
        }
    }
}