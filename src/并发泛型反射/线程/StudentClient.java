package 并发泛型反射.线程;

/**
 * @ClassName StudentClient
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/9 20:32
 */
public class StudentClient {
    public static void main(String[] args) {
        Punishment punishment = new Punishment(100,"internationalization");
        Student student = new Student("小明",punishment);
        student.copyWord();
    }
}