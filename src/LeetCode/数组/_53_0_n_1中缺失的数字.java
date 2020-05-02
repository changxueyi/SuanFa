package LeetCode.数组;

/**
 * @ClassName _53_0_n_1中缺失的数字
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/30 9:15
 */
public class _53_0_n_1中缺失的数字 {
    public int missingNumber(int[] nums) {
        //使用二分法解决
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int m = (i + j) / 2;
            if (nums[m] == m) i = m + 1;
            else j = m - 1;
        }
        return i;
    }
}