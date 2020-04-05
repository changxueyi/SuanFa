package 并发泛型反射.泛型;

/**
 * @ClassName Order
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/17 13:19
 */
public class Order<E> {
    String orderName;
    int orderId;

    //类的内容，内部结构就可以使用类的泛型
    E orderE;
    public Order(){};
    public Order(String orderName,int orderId,E orderE){
        this.orderName  = orderName;
        this.orderId  =  orderId;
        this.orderE  = orderE;
    }

    public E getOrderE(){
        return orderE;
    }
    public void setOrderE(E orderE){
        this.orderE = orderE;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
}