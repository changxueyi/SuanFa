package Test3;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName SX_08_56数组中出现的次数
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/24 15:30
 */
public class SX_08_56数组中出现的次数 {
    public int[] singleNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (set.contains(n))
                set.remove(n);
            else
                set.add(n);
        }
          return set.stream().mapToInt(Integer::intValue).toArray();
      /*  Object[] objs = set.toArray();
        for (int i = 0; i < objs.length; i++) {
            System.out.print(objs[i] + "\t");
        }//输出null	abc	Tue Mar 19 20:36:39 CST 2013 10
       */
    }


}