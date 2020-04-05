package Test.测试;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @ClassName GenericDemo2
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/17 10:37
 */
public class GenericDemo2 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("abcd");
        ts.add("cc");
        ts.add("aaa");
        ts.add("hello word ");
        Iterator<String> it = ts.iterator();
        while (it.hasNext()){
            String n = it.next();
            System.out.println(n);
        }
    }
}