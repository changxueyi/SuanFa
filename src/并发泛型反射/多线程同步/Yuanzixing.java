package 并发泛型反射.多线程同步;


import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Yuanzixing
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/31 22:52
 */
public class Yuanzixing {
    //1.定义共享变量
    //2.对number进行1000 的++操作
    //3. 使用5个线程来进行
    private static int number = 0;

    public static void main(String[] args) throws InterruptedException {
        Runnable increment = ()->{
            for (int i =0 ; i< 1000;i++){
                number++;
            }
        };
        List<Thread> list = new ArrayList<>();
        for (int i =0;i<5;i++){
            Thread t = new Thread(increment);
            t.start();
            list.add(t);
        }
        for (Thread t : list){
            t.join();
        }
        System.out.println("number=" + number);
    }
}