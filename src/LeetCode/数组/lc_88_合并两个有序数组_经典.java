package LeetCode.数组;

import java.util.Arrays;

/**
 * @ClassName lc_88_合并两个有序数组_经典
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/24 22:21
 */
public class lc_88_合并两个有序数组_经典 {
    //10点16分 不会写


    //自己写的，不正确
    /*public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0)
            return;
        int a = 0;
        int b = 0;
        int c = 0;
        int arr[] = new int[n+m];
        while (a!=m+n-1) {
            if (nums1[a] > nums2[b]) {
                arr[c] = nums2[b];
                c++;
                b++;
            }
            //   else  (nums1[a]<=nums2[b]){
            else {
                arr[c] = nums1[a];
                c++;
                a++;
            }
        }
    }*/
    //解决方案二：






    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 0, 0, 0};
        int cur[] = {2, 5, 6};
        int m = 3;
        int n = 3;
   /*     merge(arr, m, cur, n);
        System.out.println(Arrays.toString(arr));*/
    }
}