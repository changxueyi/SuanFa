package 并发泛型反射;

/**
 * @ClassName Tester
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/14 16:56
 */
public class Tester {

    //播放音乐的线程类
    static class PlayMusicThread extends Thread{
        //播放时间
        private int playTime = 50;
        public void run(){
            for (int i = 0;i<playTime;i++){
                System.out.println("播放音乐"+i);
            }
        }
    }
    //方式一：集成 Thread类
    public static void main(String[] args){
        //主线程：运行游戏
        for (int i = 0 ; i<50; i++){
            System.out.println("打游戏："+i);
            if (i==10){
                //播放音乐线程
                PlayMusicThread musicThread = new PlayMusicThread();
                musicThread.start();
            }
        }
    }
}