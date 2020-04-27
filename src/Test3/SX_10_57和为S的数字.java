package Test3;

import java.util.Arrays;

/**
 * @ClassName SX_10_57和为S的数字
 * @Description TODO https://leetcode-cn.com/problems/he-wei-sde-liang-ge-shu-zi-lcof/
 * @Author changxueyi
 * @Date 2020/4/24 16:22
 */
public class SX_10_57和为S的数字 {
    public static int[] twoSum(int[] nums, int target) {
        if (nums.length == 0 || nums == null)
            return null;
        int i = 0;
        int j = nums.length - 1;
        while (j > i) {
            int sum = nums[i] + nums[j];
            if (sum > target)
                j--;
            else if (sum > target)
                i++;
            else
                return new int[]{nums[i], nums[j]};
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int arr[] = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] cur = twoSum(arr,target);
        System.out.println(Arrays.toString(cur));
    }
}