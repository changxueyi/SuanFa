package Test2;

/**
 * @ClassName _07_调整数组顺序奇数位于偶数前面
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/3 14:18
 */
public class _07_调整数组顺序奇数位于偶数前面 {
    public int[] exchange(int[] nums) {
        int first = 0;
        int last = nums.length - 1;
        while (last > first && first != last) {
            if ( (nums[first] & 1) != 0) {
                first++;
            } else if ((nums[last] & 1) == 0) {
                last--;
            } else {
                int temp = nums[first];
                nums[first] = nums[last];
                nums[last] = temp;
            }
        }
        return nums;
    }
    //
}