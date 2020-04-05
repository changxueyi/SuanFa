package 并发泛型反射.内部类;

/**
 * @ClassName PerpleTest
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/26 20:08
 */
public class PerpleTest {
    public static void main(String[] args) {
        Person lili = new Person();
        lili.age = 12;

        //获取内部类对象实例 方式一： new 外部类.new 内部类
        Person.Heart myHeart = new Person().new Heart();
        System.out.println(myHeart.beat());

        //获取内部类对象实例，2. 外部类对象.new 内部类
        myHeart = lili.new Heart();
        System.out.println(myHeart.beat());

        //方式3  ： 外部类对象.获取方法（侧面调用）
        myHeart = lili.getHeart();
        System.out.println(myHeart.beat());
        System.out.println("*****************************");

    }
}