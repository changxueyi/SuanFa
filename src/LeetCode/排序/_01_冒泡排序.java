package LeetCode.排序;

import java.util.Arrays;

/**
 * @ClassName _01_冒泡排序
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/2/23 20:13
 */
public class _01_冒泡排序 {
    //N个数字冒泡排序，总共要进行N-1趟比较，每趟的排序次数为(N-i)次比较
    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        //需要进行arr.lenth比较
        for (int i = 0; i < arr.length - 1; i++) {
            //第i趟排序
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //09点52分 2020/3/15
    public static void vubblesort2(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,5,2,1,2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }


}