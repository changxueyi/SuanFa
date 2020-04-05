package 动态数组02;

/**
 * @ClassName Person
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/2/11 17:30
 */
public class Person {
    private int age;
    private String name;

    public Person(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}