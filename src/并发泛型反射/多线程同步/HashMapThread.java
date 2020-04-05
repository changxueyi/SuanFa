package 并发泛型反射.多线程同步;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @ClassName HashMapThread
 * @Description 并发下的hashMap
 * @Author changxueyi
 * @Date 2020/4/2 13:46
 */
public class HashMapThread {
    static Map<String, String> map = new HashMap<String, String>();

    public static class AddThread implements Runnable {
        int start = 0;

        public AddThread(int start) {
            this.start = start;
        }

        @Override
        public void run() {
            for (int i = start; i < 10000; i += 2) {
                map.put(Integer.toString(i), Integer.toBinaryString(i));
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new HashMapThread.AddThread(0));
        Thread t2 = new Thread(new HashMapThread.AddThread(1));
        t1.start();
        t2.start();
        t1.join();t2.join();
        System.out.println(map.size());
    }

}