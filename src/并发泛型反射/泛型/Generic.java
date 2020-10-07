package 并发泛型反射.泛型;

/**
 * @ClassName Generic
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/9/5 10:50
 */
public class Generic<T> {
    //是由外部定义的
    private T key;

    public Generic(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }
}