package Test3;

import java.util.Arrays;

/**
 * @ClassName lc_905_按奇偶排序数组
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/25 10:44
 */
public class lc_905_按奇偶排序数组 {
    public static int[] sortArrayByParity(int[] A) {
        if (A == null || A.length == 0) return null;
        int first = 0;
        int last = A.length-1;
        while (last > first) {
            if (last > first && (A[first] & 1) == 0) first++;
            if (last > first && (A[last] & 1) == 1) last--;
            int temp = A[first];
            A[first] = A[last];
            A[last] = temp;
        }
        return A;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        sortArrayByParity(arr);
        System.out.println(Arrays.toString(arr));
    }
}