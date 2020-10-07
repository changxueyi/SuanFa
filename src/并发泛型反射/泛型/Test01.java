package 并发泛型反射.泛型;

/**
 * @ClassName Test01
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/9/5 11:55
 */
public class Test01 {
    public static void main(String[] args) {
        ChildFirst<String> stringChildFirst =  new ChildFirst<>();
        stringChildFirst.setValue("abc");
        String value = stringChildFirst.getValue();
        System.out.println(value);
    }
}