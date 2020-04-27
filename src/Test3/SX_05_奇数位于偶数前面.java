package Test3;

import java.util.Arrays;

/**
 * @ClassName SX_05_奇数位于偶数前面
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/24 14:49
 */
public class SX_05_奇数位于偶数前面 {
    public static int[] fun(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        int i = 0;
        int j = arr.length -1;
        while (j > i) {
            while (j > i && (arr[j] & 1) == 0) j--;
            while (j > i && (arr[i] & 1) == 1) i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] cur = new int[]{1,2,3,4,5,6};
        int[] a = fun(cur);
        System.out.println(Arrays.toString(a));
    }
}