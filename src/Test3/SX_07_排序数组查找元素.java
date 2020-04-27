package Test3;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName SX_07_排序数组查找元素
 * @Description TODO https://leetcode-cn.com/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof/
 * @Author changxueyi
 * @Date 2020/4/24 15:23
 */
public class SX_07_排序数组查找元素 {
    public static int fun(int[] arr, int target) {
        if (arr.length == 0 || arr == null) {
            return -1;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            if (map.get(a) != null) {
                int b = map.get(a);
                map.put(a, ++b);
            } else {
                map.put(a, 1);
            }
        }
        return map.get(target);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 4, 34, 2, 4,3};
        int a  =fun(arr,4);
        System.out.println(a);
    }
}