package LeetCode.数组;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName lc_217_存在重复元素
 * @Description TODO https://leetcode-cn.com/problems/contains-duplicate/
 * @Author changxueyi
 * @Date 2020/4/24 21:38
 */
public class lc_217_存在重复元素 {
    public static boolean fun(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i]))
                return true;
            else
                set.add(nums[i]);
        }
        return false;
    }

    //leetcode官方答案：方法二：使用排序
    public boolean fun02(int[] nums) {
        Arrays.sort(nums);
        for (int i =0;i<nums.length-1;i++){
            if (nums[i]==nums[i+1]) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 1, 1};
        Boolean a = fun(arr);
        System.out.println(a);
    }
}