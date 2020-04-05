package 动态数组02;

import 链表03.ArrayList2;

/**
 * @ClassName Main
 * @Description 测试的主方法
 * @Author changxueyi
 * @Date 2020/2/10 15:31
 */
public class Main {
    public static void main(String[] args) {
        /*ArrayList<Integer> list  = new ArrayList();
        list.add(99);
        list.add(88);
        list.add(77);
        list.add(66);

        System.out.println(list.toString());

*/
/*
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person(15, "rose"));
        list.add(new Person(11,"java"));
        list.add(null);

        System.gc();
        System.out.println(list.toString());*/
        ArrayList2 aa = new ArrayList2();
  /*      AA.add(1);
        AA.add(2);
        AA.add(3);
        AA.add(4);
        AA.add(5);
        System.out.println(AA);*/
        aa.add(0,1);
        aa.add(0,2);
        aa.add(0,3);
        aa.add(0,4);
        aa.add(0,5);
        System.out.println(aa);

    }
}