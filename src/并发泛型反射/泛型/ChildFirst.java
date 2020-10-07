package 并发泛型反射.泛型;

/**
 * @ClassName ChildFirst
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/9/5 11:52
 */
public class ChildFirst<T> extends Parent<T> {
    @Override
    public T getValue() {
        return super.getValue();
    }
}