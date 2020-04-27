package Test3;

import java.util.Arrays;

/**
 * @ClassName SX_06_数组中超过一半的数字
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/24 15:07
 */
public class SX_06_数组中超过一半的数字 {
    //使用计数器
    public static int majorityElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int a = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (a != nums[i]) {
                count--;
            } else if (a == nums[i])
                count++;
            if (count == 0) {
                a = nums[i];
                count = 1;
            }
        }
        return a;
    }

    //最暴力的解法
    public static int majorityElement1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        int b = majorityElement1(arr);
        System.out.println(b);
        int a = 9;
        if (a/2==4){
            System.out.println("1");
        }else {
            System.out.println("2");
        }

    }
}