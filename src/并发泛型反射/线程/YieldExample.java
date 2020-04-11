package 并发泛型反射.线程;

/**
 * @ClassName YieldExample
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/9 22:27
 */
public class YieldExample {
    public static void main(String[] args) {
        Thread xioaming = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "小明--" + i);
                if (i == 2)
                    Thread.yield();
            }
        });
        Thread liyanru  = new Thread(()->{
            for (int i= 0;i<10;i++){
                System.out.println("建国--"+i);
            }
        });
        xioaming.start();
        liyanru.start();
    }
}