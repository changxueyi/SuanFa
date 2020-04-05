package 并发泛型反射.多线程同步;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

/**
 * @ClassName WaitNotifyStudy
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/1 20:36
 */
public class WaitNotifyStudy {
    public static Object object = new Object();

    public static class T1 extends Thread {
        @Override
        public void run() {
            synchronized (object) {
                //System.currentTimeMillis()计算时间方式
                System.out.println(System.currentTimeMillis() + ":T1 start!");
                try {
                    System.out.println(System.currentTimeMillis() + ":T1 wait!");
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(System.currentTimeMillis() + ":T1 end");
            }
        }
    }


    public static class T2 extends Thread {
        public void run(){
            synchronized (object){
                System.out.println(System.currentTimeMillis()+"T2 start! notify one thread");
                object.notify();
                System.out.println(System.currentTimeMillis()+":T2 end ! ");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 =new T1();
        Thread t2 = new T2();
        t1.start();
        t2.start();
    }
    /**
     * 解析：上述代码中，开启了两个线程T1和T2，T1执行了object.wait()方法时候，它是持有object的锁的，wait方法执行后，
     * T1 会进入等待，并释放了object的锁，T2在执行notify（）之前，也会先获得object的对象锁，这里为了让实验效果明显，
     * 特意安排在notify（）执行之后，让T2 休眠2秒中，这样做可以明显说明T1 在得到notify通知后，还是会先去尝试重新获得object对象锁
     *
     * 注意打印的顺序：可以看到，T2通知了T1继续执行后，T1并不能立即去执行，而是等待T2 释放了object的锁，并重新成功获得锁后，才能继续执行
     * 因此加粗的部分时间戳的间隔为2秒，因为T2休眠了两秒
     * */

}