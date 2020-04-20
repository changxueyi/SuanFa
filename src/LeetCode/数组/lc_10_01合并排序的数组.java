package LeetCode.数组;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @ClassName lc_10_01合并排序的数组
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/19 16:25
 */
public class lc_10_01合并排序的数组 {
    //暴力法，看到A为0 ，加入B，排序
    public void merge(int[] A, int m, int[] B, int n) {
        int a = 0;
        for (int i = m; i < m+n; i++) {
            A[i]=B[a++];
        }
        Arrays.sort(A);
    }


}