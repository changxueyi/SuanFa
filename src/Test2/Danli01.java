package Test2;

/**
 * @ClassName Danli01
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/2 20:01
 */
public class Danli01 {
    //饿汉式
   /* private static Danli01 danli01 = new Danli01();
    private Danli01(){};
    public static Danli01 getDanli01(){
        return danli01;
    }*/
     //懒汉式
    private static Danli01 instance;
    private Danli01(){};
    public static synchronized Danli01 getInstance(){
        if (instance==null){
            instance = new Danli01();
        }
        return instance;
    }

}