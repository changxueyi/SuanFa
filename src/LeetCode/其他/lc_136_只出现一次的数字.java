package LeetCode.其他;

import java.util.HashMap;

/**
 * @ClassName lc_136_只出现一次的数字
 * @Description TODO https://leetcode-cn.com/problems/single-number/
 * @Author changxueyi
 * @Date 2020/4/22 21:27
 */
public class lc_136_只出现一次的数字 {
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int c = nums[i];
            if (map.get(c) != null) {
                int b = map.get(c);
                //此位置需要手动写上+1
                //*************************注释这样写为什么这样写不可以***************************
                // map.put(c,b++)
                map.put(c, b+1);
            } else {
                map.put(c, 1);
            }
        }
        //ap.keySet() 该方法返回map中所有key值的列表
        for (Integer i : map.keySet()) {
            Integer count = map.get(i);
            if (count == 1) {
                return i;
            }
        }
        return -1;
    }

    //异或解法：异或运算满足交换律，a^b^a=a^a^b=b,因此ans相当于nums[0]^nums[1]^nums[2]^nums[3]^nums[4].....
    // 然后再根据交换律把相等的合并到一块儿进行异或（结果为0），然后再与只出现过一次的元素进行异或，这样最后的结果就是，只出现过一次的元素（0^任意值=任意值）
    //https://leetcode-cn.com/problems/single-number/solution/hua-jie-suan-fa-136-zhi-chu-xian-yi-ci-de-shu-zi-b/
    public int singleNumber1(int[] nums) {
        int a = 0;
        for (int c : nums) {
            a ^= c;
        }
        return a;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3, 1, 2, 5};
        int a = singleNumber(arr);
        System.out.println(a);
    }


}