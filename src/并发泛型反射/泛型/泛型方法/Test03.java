package 并发泛型反射.泛型.泛型方法;

import 并发泛型反射.泛型.Product;

import java.util.ArrayList;

/**
 * @ClassName Test03
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/9/5 12:31
 */
public class Test03 {
    public static void main(String[] args) {
        Product<Integer> product = new Product<>();
        ArrayList<String> strings = new ArrayList<>();
        strings.add("笔记本电脑");
        strings.add("苹果手机");
        strings.add("扫地机器人");
        String product1 = product.getProduct(strings);
        System.out.println(product1 + "\t"+product1.getClass().getSimpleName());
    }
}