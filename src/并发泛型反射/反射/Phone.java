package 并发泛型反射.反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName Phone
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/19 15:51
 */
public class Phone {
    private int price;
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "price=" + price +
                '}';
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
       /* Phone phone = new Phone();
        phone.setPrice(5000);
        System.out.println("Phone Price:" + phone.getPrice());
        Class clz = Class.forName("并发泛型反射.反射.Phone");
        //获取方法的 Method 对象
        Method setPriceMethod = clz.getMethod("setPrice",int.class);
        //根据 Class 对象实例获取 Constructor 对象
        Constructor phoneConstructor = clz.getConstructor();
        //使用 Constructor 对象的 newInstance 方法获取反射类对象
        Object phoneObj = phoneConstructor.newInstance();
        //利用 invoke 方法调用方法
        setPriceMethod.invoke(phoneObj,6000);
        Method getPriceMethod = clz.getMethod("getPrice");
        System.out.println("Phone Price:" + getPriceMethod.invoke(phoneObj));
        System.out.println("**************************************");
        *//*Class c1 = Object.class;
        Class c2 = int[].class;
        System.out.println(c1);
        System.out.println(c2);*//*
        Class c1 = Class.forName("并发泛型反射.反射.Phone");
        System.out.println(c1);*/
        Class clz = Class.forName("并发泛型反射.反射.Phone");
        Method setPriceMethod = clz.getMethod("setPrice", int.class);


    }
}