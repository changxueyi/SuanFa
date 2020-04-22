package Test1;

import java.util.Enumeration;

/**
 * @ClassName SX_57_和为s的两个数字
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/21 16:00
 */
public class SX_57_和为s的两个数字 {
    public int[] sum(int arr[], int target) {
        if (arr == null || arr.length == 0)
            return new int[0];
        int i = 0;
        int j = arr.length - 1;
        while (j > i) {
            int s = arr[i] + arr[j];
            if (s<target) i++;
            else if (s>target) j--;
            else
                return new int[]{arr[i],arr[j]};
        }
        //否则，直接返回一个空的数组
        return new int[0];

    }
}