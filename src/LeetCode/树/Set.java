package LeetCode.树;

/**
 * @ClassName Set
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/4 21:23
 */
public interface Set<E> {
    void add(E e);
    void remove(E e);
    boolean contains(E e);
    int getSize();
    boolean isEmpty();

}