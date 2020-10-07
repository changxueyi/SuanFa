package LeetCode.数组;

/**
 * @ClassName _53_0_n_1中缺失的数字
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/30 9:15
 */
public class _53_0_n_1中缺失的数字 {
    public static int missingNumber(int[] nums) {
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

    //20点39分 2020/9/22
    public static int fun(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int m = (i + j) / 2;
            if (nums[m] == m) i = m + 1;
            else j = m - 1;
        }
        return i;
    }

    public int fun1(int[] nums) {
        if (nums[0] == 1) return 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) return i;
        }
        return nums.length;

    }

    public static void main(String[] args) {
        int[] target = new int[]{0, 1, 2, 4, 5, 6};
        int result = missingNumber(target);
        System.out.println(result);
    }
}