package 设计模式.单例模式;

import com.sun.org.apache.regexp.internal.RE;

/**
 * @ClassName SSsingleton
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/3 14:08
 */
public class SSsingleton {
    private static volatile SSsingleton instance;

    private SSsingleton() {
    }

    ;

    public static SSsingleton getInstance() {
        if (instance == null) {
            synchronized (SSsingleton.class) {
                if (instance==null){
                    instance = new SSsingleton();
                }
            }
        }
        return instance;
    }
}