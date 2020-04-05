package Test2;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName _02_数组中重复的元素
 * @Description 一个数组，很多数字，重复的有很多，不知道那个重复了，请写出第一个重复的元素
 * @Author changxueyi
 * @Date 2020/4/3 13:31
 */
public class _02_数组中重复的元素 {
    public int findRepeatNumber(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return -1;
        }
        Map<Integer, Integer> map = new HashMap<>();
        while(nums!=null){
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(nums[i])) {
                    return nums[i];
                }
                map.put(nums[i], 1);
            }
        }
        return -1;
    }

}