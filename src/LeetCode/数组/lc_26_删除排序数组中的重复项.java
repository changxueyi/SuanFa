package LeetCode.数组;

/**
 * @ClassName lc_26_删除排序数组中的重复项
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/19 13:07
 */
public class lc_26_删除排序数组中的重复项 {
    //https://mp.weixin.qq.com/s/JcsBahMXtwX2I7QkO6OTJA
    // 经典的快慢双指针问题
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}