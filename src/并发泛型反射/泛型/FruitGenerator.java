package 并发泛型反射.泛型;

import java.util.Random;

/**
 * @ClassName FruitGenerator
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/17 16:28
 */
public class FruitGenerator<T> implements GeneratorTest2<String>{
    private String[] fruits = new String[]{"Apple", "Banana", "Pear"};
    @Override
    public String next() {
        Random rand = new Random();
        return fruits[rand.nextInt(3)];
    }
}