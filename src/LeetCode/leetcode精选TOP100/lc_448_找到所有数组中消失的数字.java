package LeetCode.leetcode精选TOP100;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName lc_448_找到所有数组中消失的数字
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/30 14:09
 */
public class lc_448_找到所有数组中消失的数字 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], true);
        }
        List<Integer> result = new LinkedList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!map.containsKey(i)) {
                result.add(i);
            }
        }
        return result;
    }
}