package LeetCode.数组;

/**
 * @ClassName _01_二维数组的查找 剑指offer
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/2/13 20:39
 */
public class _01_二维数组的查找 {
    public boolean Find(int targer, int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        //rows 是行数 cols 是列数 定义的都是最大值
        int rows = matrix.length, cols = matrix[0].length;
        int r = 0, c = cols - 1;
        while (r <= rows - 1 && c >= 0) {
            if (targer == matrix[r][c]) {
                return true;
            } else if (targer > matrix[r][c])
                r++;
            else
                c--;
        }
        return false;

    }

    //第二遍
    public boolean Find2(int targer, int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length, cols = matrix[0].length;
        int r = 0, c = cols - 1;
        while (r <= rows - 1 && c >= 0) {
            if (targer == matrix[r][c]) {
                return true;
            } else if (targer > matrix[r][c])
                r++;
            else
                c--;
        }
        return false;
    }

    /* public static void main(String[] args) {
         System.out.println((new _01_二维数组的查找()).Find("()[]{}"));
     }*/
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length;
        int cows = matrix[0].length;
        int r = 0;
        int c = cows - 1;
        while (r <= rows - 1 && c>= 0) {
            if (target == matrix[r][c]) {
                return true;
            } else if (target > matrix[r][c]) {
                r++;
            } else {
                c--;
            }
        }
        return false;
    }

    public boolean findNumberIn2DArray2(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length;
        int cows = matrix[0].length;
        int row = 0; int cow = cows - 1;
        while (row <= rows - 1 && cow >= 0) {
            if (target == matrix[row][cow]) {
                return true;
            } else if (matrix[row][cow] < target) {
                row++;
            } else {
                cow--;
            }
        }
        return false;
    }

    /**
     * 测试用例
     * 时间：2020/2/14 9：41
     *
     * @param args
     */
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(new _01_二维数组的查找().findNumberIn2DArray(arr, 5));
    }

}