package 并发泛型反射.多线程同步;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName ThreadPoolDemo
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/4 10:49
 */
public class ThreadPoolDemo {
    public static class MyTak implements Runnable {
        @Override
        public void run() {
            System.out.println(System.currentTimeMillis() + ":Thread ID:" + Thread.currentThread()
                    .getId());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyTak task = new MyTak();
        ExecutorService es = Executors.newFixedThreadPool(5);
        for (int i =0 ; i<10;i++){
            es.submit(task);
        }
    }

}