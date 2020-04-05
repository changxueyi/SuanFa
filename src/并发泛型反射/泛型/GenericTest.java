package 并发泛型反射.泛型;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName GenericTest
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/17 11:07
 */
public class GenericTest {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(78);
        list.add(87);
        list.add(00);
        list.add(99);
        /*for (Integer score:list){
            //避免了异常
            int stuScore = score;
            System.out.println(stuScore);
        }*/
        //方式二：
     /*   Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            int stuScore = iterator.next();
            System.out.println(stuScore);
        }*/
        Map<String,Integer>  map = new HashMap<String,Integer>();
        map.put("tom",87);
        map.put("jerry",99);
        System.out.println(map.toString());
        System.out.println("***************");
       // System.out.println(map.get("tom"));

    }


}