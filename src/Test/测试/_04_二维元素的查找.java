package Test.测试;

import LeetCode.数组._01_二维数组的查找;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @ClassName _04_二维元素的查找
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/24 9:47
 */
public class _04_二维元素的查找 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int r = 0, c = cols - 1;
        while (r <= rows - 1 || c >= 0) {
            if (target == matrix[r][c]) {
                return true;
            } else if (target > matrix[r][c])
                r++;
            else
                c--;
        }
        return false;
    }


    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}};
        _01_二维数组的查找 a = new _01_二维数组的查找();
        System.out.println(a.findNumberIn2DArray(arr,5));
       // System.out.println(new _01_二维数组的查找().findNumberIn2DArray(arr, 5));
    }
}