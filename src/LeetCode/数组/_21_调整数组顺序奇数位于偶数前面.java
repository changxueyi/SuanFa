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


    //Krahets 大佬的解法
    public int[] exchange02(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int temp;
        while (i < j) {
            //是奇数的话，直接++；
            while (i < j && (nums[i] & 1) == 1) i++;
            //是偶数的话，直接--；
            while (i < j && (nums[j] & 1) == 0) j--;
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        return nums;
    }

    public int[] exchange03(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int temp;
        while (i < j) {
            //如果是奇数的话，直接++
            while (i < j && (nums[i] & 1) == 1) i++;
            //如果是偶数的话
            while (i < j && (nums[j] & 1) == 0) j--;
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        return nums;
    }


    public static void main(String[] args) {

    }


}