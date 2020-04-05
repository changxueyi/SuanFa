package LeetCode.数组;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

/**
 * @ClassName _53_在排序数组中查找数字 面试题53
 * @Description https://leetcode-cn.com/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof/
 * @Author changxueyi
 * @Date 2020/2/13 21:48
 */
public class _53_在排序数组中查找数字 {
    /**
     * 方法一，for循环遍历
     *
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                j++;
            }
        }
        return j;
    }


}