package LeetCode.leetcode精选TOP100;

/**
 * @ClassName lc_283_移动零
 * @Description TODO https://leetcode-cn.com/problems/move-zeroes/
 * @Author changxueyi
 * @Date 2020/4/30 14:40
 */
public class lc_283_移动零 {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}