package 并发泛型反射.泛型;

/**
 * @ClassName Pair
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/9/5 12:13
 */
public class Pair<T, E> implements Generator<T> {
    private T key;
    private E value;

    public Pair(T key, E value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public T getKey() {
        return key;
    }

    public E getValue() {
        return value;
    }
}