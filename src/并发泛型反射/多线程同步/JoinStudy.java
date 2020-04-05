package 并发泛型反射.多线程同步;

/**
 * @ClassName JoinStudy
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/1 22:03
 */
public class JoinStudy {
    public volatile static int i = 0;

    public static class AddThread extends Thread {
        @Override
        public void run() {
            for (i=0;i<1000000;i++){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        AddThread at = new AddThread();
        at.start();
        at.join();
        System.out.println("开始打印："+ i);
    }
}