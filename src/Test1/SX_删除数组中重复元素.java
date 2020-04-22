package Test1;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @ClassName SX_删除数组中重复元素
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/19 20:45
 */
public class SX_删除数组中重复元素 {
    //前提，数组是有序的

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


    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 3, 3, 4, 5, 5, 5};

        fun(arr);
        System.out.println(Arrays.toString(arr));
    }
}