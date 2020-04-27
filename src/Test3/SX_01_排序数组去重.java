package Test3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName SX_01_排序数组去重
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/24 13:31
 */
public class SX_01_排序数组去重 {
    //返回去重后的数组
    public static int[] fun(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        int i = 0;
        int cur[] = new int[arr.length];
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
                cur[i] = arr[i];
            }
        }
        return cur;
    }

    public static int findRepeatNumber(int[] nums) {
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

    public static int[] fun1(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        int i = 0;
        int cur[] = new int[arr.length];

        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
                cur[i] = arr[i];
            }
        }
        cur[0]  =  arr[0];
        return cur;
    }

    public static void main(String[] args) {
        int cur[] = {1, 1, 2, 2, 3};
        int[] a = fun1(cur);
        System.out.println(Arrays.toString(a));
    }
}