package LeetCode.数组;

import java.util.Arrays;

/**
 * @ClassName lc_189_旋转数组
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/23 21:26
 */
public class lc_189_旋转数组 {
    public static void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0)
            return;
        int arr[] = new int[nums.length];
        int j = 0;
        for (int i = nums.length - k + 1; k <= nums.length; i++) {
            arr[j] = nums[i];
            j++;
        }
        int c = nums.length - k + 1;
        for (int s = 0; s < k; s++) {
            arr[c] = nums[s];
            c++;
        }
    }


    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 3, 4, 5, 6, 7};
        int k = 2;
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }

}