package 设计模式.单例模式;

/**
 * @ClassName EHSingleton
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/2/26 22:58
 * 优点：没有加锁，执行效率会提高。
 * 缺点：类加载时就初始化，浪费内存。
 */
public class EHSingleton {
    private static EHSingleton instance = new EHSingleton();
    private EHSingleton(){}
    public static EHSingleton getInstance(){
        return instance;
    }


}