package LeetCode.排序;

/**
 * @ClassName _03_二分非递归
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/3 20:55
 */
public class _03_二分非递归 {
    public int binarySearch(int[] arr, int k) {
        int a = 0;
        int b = arr.length;

        while (a < b) {
            int m = (a + b) / 2;
            if (k < arr[m]) {
                b = m;
            } else if (k > arr[m]) {
                a = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }
}