package 并发泛型反射.泛型;

/**
 * @ClassName Parent
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/9/5 11:51
 */
public class Parent<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}