package 并发泛型反射.泛型;

/**
 * @ClassName Test02
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/9/5 12:10
 */
public class Test02 {
    public static void main(String[] args) {
        Apple apple = new Apple();
        String a = apple.getKey();
        System.out.println(a);
        System.out.println("********************************************************************");
        Pair<String, Integer> pair = new Pair<>("count", 100);
        String key1 = pair.getKey();
        Integer value = pair.getValue();
        System.out.println(key1 + "=" + value);
    }
}