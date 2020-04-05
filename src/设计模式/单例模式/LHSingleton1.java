package 设计模式.单例模式;

/**
 * @ClassName LHSingleton1
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/2/26 22:44
 * 1、单例类只能有一个实例。
 * 2、单例类必须自己创建自己的唯一实例。
 * 3、单例类必须给所有其他对象提供这一实例。
 */
public class LHSingleton1 {
    //1、懒汉式，线程不安全
    //无论打开多少次，回收箱都只能打开一次
   /* private static LHSingleton1 instance;
    private LHSingleton1(){}
    public static LHSingleton1 getInstance(){
        if (instance == null) {
            instance = new LHSingleton1();
        }
        return instance;
    }*/
    private static LHSingleton1 instance;
    private LHSingleton1 (){}
    public static synchronized LHSingleton1 getInstance() {
        if (instance == null) {
            instance = new LHSingleton1();
        }
        return instance;
    }
}