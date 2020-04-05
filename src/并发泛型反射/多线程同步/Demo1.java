package 并发泛型反射.多线程同步;

/**
 * @ClassName Demo1
 * @Description 继承创建一个线程
 * @Author changxueyi
 * @Date 2020/3/24 17:09
 */
public class Demo1 {
    public static void main(String[] args) {
        MyRunable aa = new MyRunable();
        aa.start();
        for (int i = 0 ;i <500; i++){
            System.out.println("2222222222222主线程222222222");
        }


    }

    static class MyRunable extends Thread{
        public void run(){
            for (int i = 0 ; i < 200;i++){
                System.out.println("1111111新线程1111");
            }
        }
    }
}