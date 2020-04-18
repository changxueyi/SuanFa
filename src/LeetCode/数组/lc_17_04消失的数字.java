package LeetCode.数组;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @ClassName lc_17_04消失的数字
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/18 14:37
 */
public class lc_17_04消失的数字 {
    //思路，利用差数，解决这个问题，先计算出正常情况下所有数字的值总和
    //再 减去现在所有数组的每个值总和，差就是那个数字
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int i = 0; i <= nums.length; i++) {
            sum += i;
        }
        for (int j = 0; j < nums.length; j++) {
            sum -= nums[j];
        }
        return sum;
    }
}