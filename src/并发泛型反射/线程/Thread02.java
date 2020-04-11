package 并发泛型反射.线程;

/**
 * @ClassName Thread02
 * @Description 创建线程： 方式二
 * @Author changxueyi
 * @Date 2020/4/9 20:56
 */
public class Thread02 {
    public static void main(String[] args) {
        Thread.currentThread().setName("主线程");
        System.out.println(Thread.currentThread().getName()+":"+"输出结果");
        //创建一个线程
        Thread thread02 = new Thread(new ThreadDemo2());
        //为线程设置名字
        thread02.setName("线程二");
        //开启线程
        thread02.start();
    }
}
class ThreadDemo2 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+":"+"输出的结果");
    }
}