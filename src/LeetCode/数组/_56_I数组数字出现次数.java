package LeetCode.数组;

/**
 * @ClassName _56_I数组数字出现次数
 * @Description TODO https://leetcode-cn.com/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-lcof/solution/yi-huo-de-miao-yong-by-peterbrave/
 * @Author changxueyi
 * @Date 2020/4/11 15:10
 */
public class _56_I数组数字出现次数 {
    public int[] singleNumbers(int[] nums) {
        int xorNumber = nums[0];
        for(int k=1; k<nums.length; k++){
            xorNumber ^=nums[k];
        }
        int onePosition = xorNumber&(-xorNumber);
        int ans1 = 0, ans2 = 0;
        for(int i=0; i<nums.length; i++){
            if((nums[i]&onePosition)==onePosition){
                ans1^=nums[i];
            }else{
                ans2^=nums[i];
            }
        }

        return new int[] {ans1^0, ans2^0};
    }
}