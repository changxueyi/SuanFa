package 并发泛型反射;

/**
 * @ClassName Kejianxing
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/23 16:39
 */
public class Test01 {
    public static void main(String[] args) {
        Person1 a1 = new Person1();
        a1.PersonId = 12;
        Person1 a2 = new Person1();
        a2 = a1;
        System.out.println("o1:"+a1.PersonId+"a2 : "+a2.PersonId);
        a1.PersonId =33;
        System.out.println("o1:"+a1.PersonId+"a2 : "+a2.PersonId);


    }




    static class Person1{
        int PersonId;
    }
}