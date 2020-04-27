package Test3;

import java.util.Arrays;
import java.util.Enumeration;

/**
 * @ClassName SX_04_打印从1到最大的N位数
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/24 14:23
 */
public class SX_04_打印从1到最大的N位数 {
    public static int[] fun(int n) {
        int num = 0;
        for (int i = 0; i < n; i++) {
            num += 9 * Math.pow(10, i);
        }
        int arr[] = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = i+1;
        }
        return arr;
    }

    public static void main(String[] args) {
        int a = 2;
        int[] b = fun(2);
        System.out.println(Arrays.toString(b));
    }
}