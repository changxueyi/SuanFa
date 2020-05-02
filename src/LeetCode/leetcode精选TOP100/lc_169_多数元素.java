package LeetCode.leetcode精选TOP100;

/**
 * @ClassName lc_169_多数元素
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/30 10:50
 */
public class lc_169_多数元素 {
    public int majorityElement(int[] nums) {
        //使用计数法
        int cur = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == cur) {
                count++;
            } else if (nums[i] != cur) {
                count--;
            }
            if (count == 0) {
                cur = nums[i];
                count = 1;
            }
        }
        return cur;
    }
}