package 并发泛型反射.多线程同步;

/**
 * @ClassName ThreadTrain1
 * @Description 什么是线程安全？
 * 为什么有线程安全问题？
 * 当多个线程同时共享，同一个全局变量或静态变量，做写的操作时，可能会发生数据冲突问题，也就是线程安全问题。但是做读操作是不会发生数据冲突问题。
 * 案例:需求现在有100张火车票，有两个窗口同时抢火车票，请使用多线程模拟抢票效果。
 * @Author changxueyi
 * @Date 2020/3/27 21:32
 */
class ThreadTrain1 implements Runnable {

    private int count = 100;
    private static Object oj = new Object();
    @Override
    public void run() {
        while (count>0){
            try {
                Thread.sleep(50);
            }catch (Exception e){

            }
            sale();
        }
    }
    public void sale(){
        //前提 线程进行使用，多个线程只能拿到一把锁
        System.out.println(Thread.currentThread().getName()+",出售第" + (100 - count + 1) + "票");
        count--;
    }

}
class ThreadDemo{
    public static void main(String[] args) {
        ThreadTrain1 threadTrain1 = new ThreadTrain1();
        Thread aa = new Thread(new ThreadTrain1());
        Thread t1 = new Thread(threadTrain1, "1号窗口");
        Thread t2 = new Thread(threadTrain1, "2号窗口");
        System.out.println(aa.getName());
        aa.start();
        t1.start();
        t2.start();
    }
}
