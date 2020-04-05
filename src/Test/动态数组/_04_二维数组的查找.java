package Test.动态数组;

/**
 * @ClassName _04_二维数组的查找
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/2/19 21:48
 */
public class _04_二维数组的查找 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length, cols = matrix[0].length;
        int r = 0, c = cols - 1;
        while (r <= rows - 1 && c >= 0) {
            if (target == matrix[r][c]) {
                return true;
            } else if (target > matrix[r][c]) {
                r++;
            } else{
                c--;}
        }
        return false;
    }
}