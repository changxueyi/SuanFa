package LeetCode.数组;

/**
 * @ClassName _21_调整数组顺序奇数位于偶数前面
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/15 15:33
 */
public class _21_调整数组顺序奇数位于偶数前面 {
    public int[] exchange(int[] nums) {
        //双指针解法
        int left = 0, right = nums.length - 1;
        while (left < right) {
            while (left < nums.length && (nums[left] & 1) == 1)
                left++;
            while (right >= 0 && (nums[right] & 1) == 0)
                right--;
            if (left >= right)
                break;
            int mid = nums[left];
            nums[left] = nums[right];
            nums[right] = mid;
        }
        return nums;
    }

    public int[] exchange1(int[] nums) {
        //调整顺序，使奇数位于偶数前面，利用双指针技术
        int left = 0, right = nums.length - 1;
        while (left != right) {
            while (left < nums.length && (nums[left] & 1) == 1)
                left++;
            while (right >= 0 && (nums[right] & 1) == 0)
                right--;
            if (left >= right)
                break;
            int mid = nums[left];
            nums[left] = nums[right];
            nums[right] = mid;
        }
        return nums;
    }

    public static void main(String[] args) {

    }


}