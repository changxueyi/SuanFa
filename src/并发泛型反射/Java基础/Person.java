package 并发泛型反射.Java基础;

/**
 * @ClassName Person
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/9 16:33
 */
public class Person {
    int age;
    public Heart getHeart(){
        return new Heart();
    }

    //成员内部类,内部类在外部使用时候，无法直接实例化，需要借用外部类信息才能完成实例化
    class Heart{
        public String beat(){
            return "心脏在跳动";
        }
    }

}