package LeetCode.数组;

/**
 * 时间：2020/1/6 16：51
 * https://leetcode-cn.com/problems/two-sum/
 * 两数之和
 */
public class Leetcode01 {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i=0;i<nums.length;i++)
        {
            int dif=target-nums[i];
            for (int j=i+1;j<nums.length;j++)
                if (nums[j]==dif){
                    res[0]=i;
                    res[1]=j;
                    return res;
                }

        }
        return res;

    }
}
