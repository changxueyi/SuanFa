package LeetCode.数组;

import java.util.Arrays;

/**
 * @ClassName _39_数组中出现次数超过一半的数字
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/31 9:18
 */
public class _39_数组中出现次数超过一半的数字 {
    public int majorityElement(int[] nums) {
        //方法一：排序取中值
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    //摩尔投票法
    //方法二：不正常思路的话，用target记录上一次访问的值，count表明当前值出现的次数，
    // 如果下一个值和当前值相同那么count++；如果不同count--，减到0的时候就要更换新的target值了
    // ，因为如果存在超过数组长度一半的值，那么最后target一定会是该值。可以这样理解，
    // count的自加和自减就是在描述一种抵消关系，由于超过一半的出现次数，导致最后的target一定会是该值。
    // （这种方法的时间复杂度自然会小些）
    public int majorityElement1(int[] nums) {
        // 1 2 1  1 2 1  1 1
        int target = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (target == nums[i]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                target = nums[i];
                count = 1;
            }
        }
        return target;
    }

    public int majorityElement2(int[] nums) {
        int target = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (target == nums[i]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                target = nums[i];
                count = 1;
            }
        }
        return target;
    }

    //20点17分 2020 / 7 / 21
    public int majorityElement3(int[] nums) {
        int target = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (target == nums[i]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                target = nums[i];
                count = 1;
            }
        }
        return target;
    }

    /**
     * 京东集团
     */
    public int majorityElement4(int[] nums) {
        //采用异或的模式进行解答本题
        int target = nums[0];
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                target = nums[i];
                count = 1;
            }
        }
        return target;
    }
}