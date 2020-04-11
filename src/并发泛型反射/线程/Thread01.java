package 并发泛型反射.线程;

/**
 * @ClassName Thread01
 * @Description 创建线程 方式一 继承https://www.cnblogs.com/li666/p/11139968.html
 * @Author changxueyi
 * @Date 2020/4/9 20:49
 */
public class Thread01 {
    public static void main(String[] args) {
        Thread.currentThread().setName("主线程");
        System.out.println(Thread.currentThread().getName() + ":" + "输出的结果");
        //创建一个线程
        ThreadDemo1 threadDemo1 = new ThreadDemo1();
        //为线程设置名称
        threadDemo1.setName("线程一");
        threadDemo1.start();
    }
}

class ThreadDemo1 extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ":" + "输出的结果");
    }
}