package LeetCode.其他;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName _57_II和为s的连续正数序列
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/30 21:28
 */
public class _57_II和为s的连续正数序列 {
    //这个写法真的是绝了
    public int[][] findContinuousSequence(int target) {
        int i = 1; // 滑动窗口的左边界
        int j = 1; // 滑动窗口的右边界
        int sum = 0; // 滑动窗口中数字的和
        List<int[]> res = new ArrayList<>();

        while (i <= target / 2) {
            if (sum < target) {
                // 右边界向右移动
                sum += j;
                j++;
            } else if (sum > target) {
                // 左边界向右移动
                sum -= i;
                i++;
            } else {
                // 记录结果
                int[] arr = new int[j - i];
                for (int k = i; k < j; k++) {
                    arr[k - i] = k;//arr[0] = 1 arr[1] = 2 arr[3] = 3 arr[
                }
                res.add(arr);
                // 左边界向右移动
                sum -= i;
                i++;
            }
        }

        return res.toArray(new int[res.size()][]);
    }

    //方法二  容易理解的版本
    public int[][] findContinuousSequence1(int target) {
        List<int[]> list = new ArrayList<>();
        int sum = 0;
        int start = 1;
        int end = 2;
        while (end > start) {
            sum = (start + end) * (end - start + 1) / 2;
            //找到序列
            if (sum == target) {
                int[] res = new int[end - start + 1];
                for (int j = 0; j < res.length; j++) {
                    res[j] = start + j;
                }
                list.add(res);
                start++;
            } else if (sum < target) {
                end++;
            } else {
                start++;
            }
        }
        return list.toArray(new int[0][]);
    }

}