package Test1;

/**
 * @ClassName SX_01二维数组的查找
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/21 8:13
 */
public class SX_01二维数组的查找 {
    //关于为什么选择右上角开始，这里详细分析下
    // 从右上角开始，如果目标元素大于现在位置元素，则一定在现在元素下面,
    // 从左上角开始，如果目标元素大于现在元素，导致可能下面也有元素，右边也有元素，没法查找目标元素

    public static boolean fun(int[][] arr, int target) {
        //arr.length 行数       arr[0].length 列数
        if (arr == null || arr.length == 0 || arr[0].length == 0)
            return false;
        //总行数
        int row = arr.length;
        //总列数
        int cow = arr[0].length;
        //从右上交开始找
        int r = 0, c = cow - 1;
        while (r < row - 1 && c >= 0) {
            if (arr[r][c] > target)
                c--;
            else if (arr[r][c] < target)
                r++;
            else
                return true;
        }
        return false;
    }

    public static boolean fun01(int[][] arr, int target) {
        if (arr == null || arr.length == 0 || target == 0) {
            return false;
        }
        int rows = arr.length;
        int cows = arr[0].length;
        int r = 0, c = cows - 1;
        while (r < rows - 1 && c >= 0) {
            if (arr[r][c] > target) {
                c--;
            } else if (arr[r][c] < target) {
                r++;
            } else
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        //       int arr[][];
        int[][] arr = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}};
        Boolean a = fun01(arr, 11);
        System.out.println(a);
    }
}