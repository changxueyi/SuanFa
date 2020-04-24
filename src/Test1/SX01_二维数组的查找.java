package Test1;

/**
 * @ClassName SX01_二维数组的查找
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/23 21:12
 */
public class SX01_二维数组的查找 {
    public static boolean fun(int[][] arr, int target) {
        if (arr.length == 0 || arr[0].length == 0) {
            return false;
        }
        int row = arr.length;
        int cow = arr[0].length;
        int r = 0;
        int c = cow - 1;
        while (r <= row - 1 && c >= 0) {
            if (arr[r][c] > target) {
                c--;
            } else if (arr[r][c] < target) {
                r++;
            } else
                return true;
        }
        return false;
    }
}