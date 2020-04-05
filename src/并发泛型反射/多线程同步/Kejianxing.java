package 并发泛型反射.多线程同步;

/**
 * @ClassName Kejianxing
 * @Description TODO 可见性问题
 * @Author changxueyi
 * @Date 2020/3/31 22:42
 */
public class Kejianxing {
    private static boolean flag = true;

    public static void main(String[] args) throws InterruptedException {
        new Thread(()->{
            while (flag){

            }
        }).start();
        Thread.sleep(2000);
        new Thread(()->{
            flag=false;
            System.out.println("xiugaile");
        }).start();
    }
}