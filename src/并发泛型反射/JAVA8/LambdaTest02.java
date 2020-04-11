package 并发泛型反射.JAVA8;

import Test.测试.LambdaTest;

/**
 * @ClassName LambdaTest02
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/9 17:11
 */
public class LambdaTest02 implements Runnable {
    @Override
    public void run() {
        System.out.println("常学奕");
    }

    public static void main(String[] args) {
        Thread thread01 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(2 + ":" + i);
            }
        });
        thread01.start();
        System.out.println("***************");
        LambdaTest02 a1 = new LambdaTest02();
        Thread thread02 = new Thread(a1, "lambdaTest");
        thread02.start();
        System.out.println("************");

    }

}