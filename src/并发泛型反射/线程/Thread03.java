package 并发泛型反射.线程;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @ClassName Thread03
 * @Description TODO 创建线程方式二：实现callable接口
 * @Author changxueyi
 * （1）创建一个类并实现Callable接口
 * （2）重写call()方法，将所要完成的任务的代码写进call()方法中，需要注意的是call()方法有返回值，并且可以抛出异常
 * (3）如果想要获取运行该线程后的返回值，需要创建Future接口的实现类的对象，即FutureTask类的对象，调用该对象的get()方法可获取call()方法的返回值
 * （4）使用Thread类的有参构造器创建对象，将FutureTask类的对象当做参数传进去，然后调用start()方法开启并运行该线程。
 * @Date 2020/4/9 21:00
 */
public class Thread03 {
    public static void main(String[] args) throws Exception {
        System.out.println(Thread.currentThread().getName() + ":" + "输出的结果");
        //创建Thread 类的对象
        FutureTask<String> task = new FutureTask<String>(new ThreadDemo03());
        //创建Thread类的对象
        Thread thread03 = new Thread(task);
        thread03.setName("线程三");
        //开启线程
        thread03.start();
        String result = task.get();
        System.out.println(result);
    }
}

class ThreadDemo03 implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName() + ":" + "输出的结果");
        return Thread.currentThread().getName() + ":" + "返回的结果";
    }
}