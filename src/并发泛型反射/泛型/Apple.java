package 并发泛型反射.泛型;

/**
 * @ClassName Apple
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/9/5 12:08
 */
public class Apple implements Generator<String> {
    @Override
    public String getKey() {
        return "hello changxueyi";
    }
}