package Test3;

/**
 * @ClassName SX_09_数组中只有一个出现一次
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/24 15:57
 */
public class SX_09_数组中只有一个出现一次 {
    public static int fun(int[] arr) {
        if (arr.length == 0 || arr == null) {
            return -1;
        }
        int a = arr[0];
        for (int i = 1; i < arr.length; i++) {
            a ^= arr[i];
        }
        return a;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3, 4, 3};
        int a = fun(arr);
        System.out.println(a);
    }
}