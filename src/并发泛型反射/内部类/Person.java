package 并发泛型反射.内部类;

/**
 * @ClassName Person
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/26 20:04
 */
//内部类
public class Person {
    public int age;
    public Heart getHeart(){
        return new Heart();
    }
    public void eat(){
        System.out.println("人会吃东西");
    }


    //内部类的访问修饰符可以任意，但是范围受到影响 ,一般都是public
    class Heart{
        public String beat(){
            eat();
            return age+"岁心脏在跳动";
        }
    }
}