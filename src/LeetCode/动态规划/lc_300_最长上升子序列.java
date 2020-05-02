package LeetCode.动态规划;

import java.util.Arrays;

/**
 * @ClassName lc_300_最长上升子序列
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/1 15:51
 */
public class lc_300_最长上升子序列 {
    //注意「子序列」和「子串」这两个名词的区别，
    // 子串一定是连续的，而子序列不一定是连续的
    public static int lengthOfLIS(int[] nums) {

        //dp[i] 表示以 nums[i] 这个数结尾的最长递增子序列的长度。
        int[] dp = new int[nums.length];
        //dp 数组全部初始化为1
        Arrays.fill(dp, 1);
        for (int i = 0; i < nums.length; i++) {
            //下面这段代码的逻辑就可以算出 dp[5]
            for (int j = 0; j < i; j++) {
                //nums[5] = 3，既然是递增子序列，我们只要找到前面那些结尾比 3 小的子序列，
                // 然后把 3 接到最后，就可以形成一个新的递增子序列，而且这个新的子序列长度加一。
                if (nums[i] > nums[j])
                    dp[i] = Math.max(dp[i], dp[j] + 1);
            }
        }

        int res = 0;
        for (int i = 0; i < dp.length; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }


    public static void main(String[] args) {
        int arr[] = {1, 4, 3, 4, 2, 3};
        int a = lengthOfLIS(arr);
        System.out.println(a);
    }

}