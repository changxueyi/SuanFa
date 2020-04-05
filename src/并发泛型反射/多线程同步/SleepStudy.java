package 并发泛型反射.多线程同步;

/**
 * @ClassName SleepStudy
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/1 20:17
 */
public class SleepStudy {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                while (true){
                    if (Thread.currentThread().isInterrupted()){
                        System.out.println("interruted!");
                        break;
                    }
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        System.out.println("inTERRUTRED WHER SLEEP");
                        Thread.currentThread().interrupt();
                    }
                    Thread.yield();
                }
            }
        };
        t1.start();
        Thread.sleep(2000);
        t1.interrupt();
    }
}