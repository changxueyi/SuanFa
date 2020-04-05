package 并发泛型反射.泛型;

/**
 * @ClassName GenericTest1
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/17 13:26
 */
public class GenericTest1 {
    public static void main(String[] args) {
       /* //
        Order order = new Order();
        order.setOrderE(123);
        order.setOrderE("ABC");
        //建议：
        Order<String> order1 = new Order<>("orderAA",1001,"changxueyi");
        order1.setOrderE("AA:HELLO");*/
       SubOrder sub1 = new SubOrder();
       //子类继承父类，则实例化子类对象时候，不再指明泛型
       sub1.setOrderE(1122);
        System.out.println(sub1.getOrderE());
        System.out.println("****************************");
        Order order = new Order();
        order.setOrderE("changxueyi");
        System.out.println(order.getOrderE());
        order.setOrderE(111);
        System.out.println(order.getOrderE());
    }
}