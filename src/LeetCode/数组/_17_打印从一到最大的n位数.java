package LeetCode.数组;

/**
 * @ClassName _17_打印从一到最大的n位数
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/29 21:06
 */
public class _17_打印从一到最大的n位数 {
    //巨坑的一道题,没有想象的那样的简单
    //输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。
    // 比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
    //输入: n = 1
    //输出: [1,2,3,4,5,6,7,8,9]
    public int[] printNumbers(int n) {
        int ans = 0;
        for (int i = 0; i < n; i++) {
            //Math.pow(底数,几次方)
            ans += 9 * Math.pow(10, i);
        }
        int[] res = new int[ans];
        for (int i = 0; i < ans; i++) {
            res[i] = i + 1;
        }
        return res;
    }

    public int[] printNumbers2(int n) {
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += 9 * Math.pow(10, i);
        }
        int[] res = new int[ans];
        for (int i = 0; i < ans; i++) {
            res[i] = i + 1;
        }
        return res;
    }

    public static void main(String[] args) {
        _17_打印从一到最大的n位数 aa = new _17_打印从一到最大的n位数();
        aa.printNumbers(1);
    }

}