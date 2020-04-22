package 算法_Algorithms.第一章;

import java.util.Arrays;

/**
 * @ClassName _1_1_53使用数组
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/21 20:37
 */
public class _1_1_53使用数组 {
    //找出数组中最大的数字,返回这个数字
    public static int fun01(int arr[]) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //复制一个一模一样的数组
    public static int[] fun02(int[] arr) {
        int a = arr.length;
        int[] b = new int[a];
        for (int i = 0; i < arr.length; i++) {
            b[i] = arr[i];
        }
        return b;
    }

    //反转数组元素的顺序
    public static int[] fun03(int[] arr) {
        int[] cur = new int[arr.length];
        int a = arr.length - 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (a >= 0) {
                cur[i] = arr[a];
                a--;
            }
        }
        return cur;
    }

    //算法书中的
    public static void fun04(int[] a) {
        int N = a.length;
        for (int i = 0; i < N / 2; i++) {
            int  temp = a[i];
            a[i] = a[N-1-i];
            a[N-1-i] = temp;
        }
    }


    public static void main(String[] args) {
        //创建数组的三种方式
        //1.方式一
        int arr[];
        arr = new int[]{1, 2, 3, 4, 5, 6, 4, 34};
        //2.方式二
        int cur[] = {1, 2, 3, 4, 3, 34, 4, 55, 555};
        //下面注释的都是跑成功的
       /* int a = fun01(arr);
        System.out.println(a);
        int b = fun01(cur);
        System.out.println(b);
        int[] c = fun02(arr);
        // Arrays.sort(c);
        System.out.println(Arrays.toString(c));
        //fun03
        int[] d = fun03(arr);
        System.out.println(Arrays.toString(d));*/
        System.out.println("*************");
        fun04(arr);
        System.out.println(Arrays.toString(arr));
    }
}