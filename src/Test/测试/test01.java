package Test.测试;

/**
<<<<<<< HEAD
 * @ClassName Test01
=======
 * @ClassName test01
>>>>>>> a454660e5d5a51bb6461888777cf74cf727f8c22
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/18 13:35
 */
public class test01 {
    public static void main(String[] args) {
        int a = 1234;
        int b = 2222;
        a =a^b;
        b =a^b;
        a= a^b;
        System.out.println("a:"+a+" "+" b: "+b);
    }
}