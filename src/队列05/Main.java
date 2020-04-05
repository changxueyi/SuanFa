package 队列05;

/**
 * @ClassName Main
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/2/14 13:13
 */
public class Main {
    public static void main(String[] args) {
        ArrayQueue<Integer> queue = new ArrayQueue<>();
        for (int i = 0;i<10;i++){
            queue.enqueue(i);
            System.out.println(queue);
            if(i % 3 == 2){
                queue.dequeue();
                System.out.println(queue);
            }
        }
    }
}