package 并发泛型反射.泛型;

import 队列05.PriorityQueue;

import java.util.ArrayList;
import java.util.Random;

/**
 * @ClassName Product
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/9/5 11:31
 */
public class Product<T> {

    Random random = new Random();
    private T product;
    ArrayList<T> list = new ArrayList<>();

    public void addProduct(T t) {
        list.add(t);
    }

    public T getProduct() {
        product = list.get(random.nextInt(list.size()));
        return product;
    }
    public <E> E getProduct(ArrayList<E> list){
        return list.get(random.nextInt(list.size()));
    }

}