package 队列05;

/**
 * @ClassName Queue
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/2/14 11:06
 */
public interface Queue<E> {
    int getSize();
    boolean isEmpty();
    void enqueue(E e);
    E dequeue();
    E getFront();
}