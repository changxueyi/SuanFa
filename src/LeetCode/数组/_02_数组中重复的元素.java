package LeetCode.数组;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName _02_数组中重复的元素
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/2/13 21:12

 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字是重复的。
 * 也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 * 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
 */
public class _02_数组中重复的元素 {
    public int findRepeatNumber1(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i =0;i<nums.length;i++){
            if (map.containsKey(nums[i])){
                return nums[i];
            }else {
                map.put(nums[i],10);
            }
        }
        return -1;
    }

    //快慢指针
    //消除重复元素，返回消除后的节点数量
    public static int fun(int[] nums) {
        if (nums.length == 0) return 0;
        int a = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[a]) {
                a++;
                nums[a] = nums[j];
            }
        }
        return a + 1;
    }

    public int findRepeatNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return nums[i];
            } else {
                map.put(nums[i], 2);
            }
        }
        return -1;
    }
    //10点03分 2020/3/12
    public int findRepeatNumber2(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0 ; i<nums.length;i++){
            if (map.containsKey(nums[i])){
                return nums[i];
            }else{
                map.put(nums[i],10);
            }
        }
        return -1;
    }



    /**
     * 测试用例
     */
    public static void main(int[] args) {
        int arr[]=new int[]{1,2,3,4,5};
        System.out.println(new _02_数组中重复的元素().findRepeatNumber(arr));
    }

}