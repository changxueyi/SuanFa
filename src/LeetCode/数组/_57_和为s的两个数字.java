package LeetCode.数组;

/**
 * @ClassName _57_和为s的两个数字
 * @Description TODO https://leetcode-cn.com/problems/he-wei-sde-liang-ge-shu-zi-lcof/
 * 输入一个递增排序的数组和一个数字s，在数组中查找两个数，使得它们的和正好是s。
 * 如果有多对数字的和等于s，则输出任意一对即可。
 * @Author changxueyi
 * @Date 2020/4/10 9:18
 */
public class _57_和为s的两个数字 {
    //此方法不行，**************测试通不过*************
    public static int[] twoSum1(int[] nums, int target) {
        /**
         * 我的思路：target - num【i】 = x;
         *    遍历数组，有x 返回，没有的话，target = target-num【i++】
         *    继续遍历循环
         */
        for (int i = 0; i < nums.length; i++) {
            //        if (nums[i] < target)
            int x = target - nums[i];
            for (int j = i; j < nums.length - i; j++) {
                if (nums[j] == x)
                    return new int[]{nums[i], nums[j]};
            }
            // 注意返回类型为int[]  时候，如果是自己创建的就需要设置好
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{1, 3, 4, 5, 56};
        int target = 6;
        int[] b = twoSum1(arr, target);
        System.out.println(b.toString());
    }

    //由于题目的数组条件为递增数组，所以可以采用双指针方法，
    // 一左一右，相加后与target比较，小->左指针右移，大->右指针左移，直至等于target。
    // 否则返回空数组。
    public int[] twoSum(int[] nums, int target) {
        //使用双指针
        int left = 0;
        int right = nums.length - 1;
        while (right > left) {
            if (nums[left] + nums[right] < target) {
                left++;
            } else if (nums[left] + nums[right] > target) {
                right++;
            } else
                return new int[]{nums[left], nums[right]};
        }
        return new int[]{};
    }


}