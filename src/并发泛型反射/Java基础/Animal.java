package 并发泛型反射.Java基础;

/**
 * @ClassName Animal
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/9 16:10
 */
public abstract  class Animal {
    //
    private String name;
    private int month;

    public Animal() {

    }

    public Animal(String name, int month) {
        this.name = name;
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
    //方法 ：吃东西
    public void eat(){
        System.out.println("动物吃东西");
    }
    public static  void say(){
        System.out.println("动物间打招呼");
    }
}