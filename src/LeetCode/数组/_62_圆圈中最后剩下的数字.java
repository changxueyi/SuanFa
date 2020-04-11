package LeetCode.数组;


import java.util.ArrayList;

/**
 * @ClassName _62_圆圈中最后剩下的数字
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/10 13:48
 */
public class _62_圆圈中最后剩下的数字 {
    /**
     * 假设当前删除的位置是 idx，下一个删除的数字的位置是  idx + m 。
     *      * 但是，由于把当前位置的数字删除了，后面的数字会前移一位，
     *      * 所以实际的下一个位置是 1idx + m − 1。由于数到末尾会从头继续数，所以最后取模一下，
     *      * 就是  (idx + m - 1)(mode n)
     * @param n
     * @param m
     * @return
     */
    public static int lastRemaining(int n, int m) {
        ArrayList<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int idx = 0;
        while (n > 1) {
            //这块太难想了
            idx = (idx + m - 1) % n;

            list.remove(idx);
            n--;
        }
        return list.get(0);
    }
    public static void main(String[] args) {
        int n = 5;
        int m =2;
        int a = lastRemaining(5,2);
        System.out.println(a);
    }
}