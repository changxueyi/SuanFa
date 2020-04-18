package LeetCode.数组;

import java.util.Arrays;

/**
 * @ClassName lc_17_10主要元素
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/18 15:09
 */
public class lc_17_10主要元素 {
    public int majorityElement(int[] nums) {
        //使用摩尔投票法
        int target = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == target) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                target = nums[i];
                count = 1;
            }
        }
        //判断返回的这个target，次数是否是大于一半的，两种情况，一种是大于一半，
        // 还有一种情况是，返回了target，这个时候target不是超过一半的，
        // 这就需要从新遍历一次，计算下出现的次数是否是大于一半的，大于直接返回，否则返回-1
        int b = 0;
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            if (target == a) {
                b++;
            }
        }
        if (b > nums.length / 2) {
            return target;
        } else
            return -1;
    }


    //怀疑这个是错的，但是结果竟然是正确的UP
    //https://leetcode-cn.com/problems/find-majority-element-lcci/solution/zhe-ti-ti-jiao-ji-bai-90yi-shang-de-ji-ben-du-shi-/
    public static  int majorityElement1(int[] nums) {
        // 投票算法
        int temp = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == temp) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                temp = nums[i];
                count = 1;
            }
        }

        // 验证是否满足要求
        int t = nums.length / 2 + 1;
        count = 0;
        for (int num : nums) {
            if (num == temp) count++;
            if (count == t) return temp;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1,1,1,1,1,1,1,1};
        int b = majorityElement1(arr);
        System.out.println(b);
    }

}