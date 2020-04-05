package 并发泛型反射.多线程同步;

/**
 * @ClassName WaitNotifyStudy02
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/1 21:13
 */
public class WaitNotifyStudy02 {
    //创建一个锁对象
    public static Object object = new Object();

    public static class Thread01 implements Runnable {
        @Override
        public void run() {
            synchronized (object) {
                System.out.println(System.currentTimeMillis() + ":Thread01 start");
                try {
                    System.out.println(System.currentTimeMillis() + ":T1 wait for object");
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(System.currentTimeMillis() + ":T1 end!");
            }

        }
    }

    public static class Thread02 extends Thread {
        public void run(){
            synchronized (object){
                System.out.println(System.currentTimeMillis() + ":T2 start! notify one Thread");
                object.notify();
                System.out.println(System.currentTimeMillis()+":T2 end!");
                try{
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread01());
        Thread02 t2 = new Thread02();
        t1.start();
        t2.start();
    }


}