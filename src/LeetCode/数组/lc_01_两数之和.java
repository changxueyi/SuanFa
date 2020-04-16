package LeetCode.数组;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @ClassName lc_01_两数之和
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/12 16:44
 */
//给定一个数组，一个数字，返回两个相加等于这个数的两个数字索引值
public class lc_01_两数之和 {
    // 此方法适用于加个限制条件的情况下，比如是排序的数组
    public static int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int a = 0;
        int b = nums.length - 1;
        int[] arr = new int[]{};
        while (a < b) {
            if (target > nums[a] + nums[b])
                a++;
            else if (target < nums[a] + nums[b])
                b--;
            else if (target == nums[a] + nums[b]) {
                return new int[]{a,b};
            }
        }
        return new int[]{};
    }
    //可以泡通，但是时间复杂度太大了，不推荐使用
    public int[] twoSum1(int[] nums, int target) {
        int[] res = new int[2];
        for (int i=0;i<nums.length;i++)
        {
            int dif=target-nums[i];
            for (int j=i+1;j<nums.length;j++)
                if (nums[j]==dif){
                    res[0]=i;
                    res[1]=j;
                    return res;
                }
        }
        return res;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 7,  11, 15};
        int target = 9;
        int[] a = twoSum(arr, target);
        System.out.println(Arrays.toString(a));
    }
}