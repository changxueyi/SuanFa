package LeetCode.数组;

/**
 * @ClassName lc_27_移除元素
 * @Description TODO https://leetcode-cn.com/problems/remove-element/
 * @Author changxueyi
 * @Date 2020/4/24 21:50
 */
public class lc_27_移除元素 {
    //************经典必看好题************************************


    /**
     * 你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
     * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组
     * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
     */
    //https://leetcode-cn.com/problems/remove-element/solution/hua-jie-suan-fa-27-yi-chu-yuan-su-by-guanpengchn/
    //思路：拷贝覆盖
    //主要思路是遍历数组nums，每次取出的数字变量为num，同时设置一个下标ans
    //在遍历过程中如果出现数字与需要移除的值不相同时，则进行拷贝覆盖nums[ans] = num，ans自增1
    //如果相同的时候，则跳过该数字不进行拷贝覆盖，最后ans即为新的数组长度
    //这种思路在移除元素较多时更适合使用，最极端的情况是全部元素都需要移除，遍历一遍结束即可
    public int removeElement(int[] nums, int val) {
        int ans = 0;
        for (int num : nums) {
            if (num != val) {
                nums[ans] = num;
                ans++;
            }
        }
        return ans;
    }

    //第二种思路
    //标签：交换移除    https://leetcode-cn.com/problems/remove-element/solution/hua-jie-suan-fa-27-yi-chu-yuan-su-by-guanpengchn/
    //主要思路是遍历数组nums，遍历指针为i，总长度为ans
    //在遍历过程中如果出现数字与需要移除的值不相同时，则i自增1，继续下一次遍历
    //如果相同的时候，则将nums[i]与nums[ans-1]交换，即当前数字和数组最后一个数字进行交换，交换后就少了一个元素，故而ans自减1
    //这种思路在移除元素较少时更适合使用，最极端的情况是没有元素需要移除，遍历一遍结束即可
    //时间复杂度：O(n)，空间复杂度：O(1)

    public int reremoveElementmo1(int[] nums, int val) {
        int ans = nums.length;
        for (int i = 0; i < ans; ) {
            if (nums[i] == val) {
                nums[i] = nums[ans - 1];
                ans--;
            } else
                i++;
        }
        return ans;
    }
}