package Test2;

/**
 * @ClassName _01_二维数组的查找
 * @Description //  定义一个整型数组:3行4列
 * int a[][] = new int[3][4];
 * //获取行数---3行
 * int lenY = a.length;
 * //获取列数---4列
 * int lenX = a[0].length;
 * @Author changxueyi
 * @Date 2020/4/3 13:13
 */
public class _01_二维数组的查找 {
    public boolean search(int target, int[][] arr) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        int rows = arr.length;
        int cows = arr[0].length;
        int r = 0;
        int c = cows - 1;
        while (rows >= c && cows >= 0) {
            if (target >= arr[r][c]) {
                r++;
            } else if (target <= arr[r][c]) {
                c--;
            } else
                return true;

        }
        return false;
    }
}