package 并发泛型反射.线程;

/**
 * @ClassName Thread
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/24 14:07
 */
class MyThread extends java.lang.Thread{
    public void run(){
        System.out.println("该线程正在执行");
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        System.out.println("主线程1");
        MyThread mt = new MyThread();
        mt.start();
        System.out.println("主线程2");
    }

}