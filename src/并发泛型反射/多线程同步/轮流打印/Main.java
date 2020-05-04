package 并发泛型反射.多线程同步.轮流打印;

/**
 * @ClassName Main
 * @Description TODO https://blog.csdn.net/HuJiaHao_Pa/article/details/104572849
 * @Author changxueyi
 * @Date 2020/5/3 17:11
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        /**
         * 这个位置必须是 0  1 2
         */
        Thread t1 = new Thread(new MyThread(0));
        Thread t2 = new Thread(new MyThread(1));
        Thread t3 = new Thread(new MyThread(2));
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
    }
}