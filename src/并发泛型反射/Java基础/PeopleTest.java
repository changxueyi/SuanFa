package 并发泛型反射.Java基础;

/**
 * @ClassName PeopleTest
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/9 16:39
 */
public class PeopleTest {
    public static void main(String[] args) {
        Person lili = new Person();
        lili.age=12;
        //获取内部类对象 方式一：
        Person.Heart myHeart  = new Person().new Heart();
        System.out.println(myHeart.beat());
        //方式二
        myHeart = lili.new Heart();
        System.out.println(myHeart.beat());
        //方式三
        myHeart = lili.getHeart();
        System.out.println(myHeart.beat());
    }
}