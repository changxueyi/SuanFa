package LeetCode.递归;

import java.util.List;

/**
 * @ClassName lc_08_06汉诺塔问题
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/18 15:40
 */
public class lc_08_06汉诺塔问题 {
    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
        hanota(A.size(), A, B, C);
    }

    public void hanota(int n, List<Integer> A, List<Integer> B, List<Integer> C) {
        if (n == 1) {
            removeTo(A, C);
            return;
        }
        //把A柱子上面的n-1个盘子，借助辅助柱子C，放到柱子B上
        hanota(n - 1, A, C, B);
        removeTo(A,C);
        hanota(n-1,B,A,C);
    }

    //从l1移动到l2
    private void removeTo(List<Integer> l1, List<Integer> l2) {
        l2.add(l1.remove(l1.size() - 1));
    }
}