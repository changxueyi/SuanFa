package 并发泛型反射.泛型;

/**
 * @ClassName MainClass
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/9/5 10:45
 */
public class MainClass {
    public static void main(String[] args) {
        Generic<String> generic  = new Generic<>("aaa");
        System.out.println(generic.getKey());
        //传入一个对象
        Student student = new Student();
        student.setAge(1);
        student.setName("changxueyi");
        Generic<Student> generic1 = new Generic<>(student);
        System.out.println(generic1.getKey().toString());


    }
}