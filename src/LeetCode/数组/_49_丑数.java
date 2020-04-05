package LeetCode.数组;

import static java.util.Collections.min;

/**
 * @ClassName _49_丑数
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/28 21:39
 */
public class _49_丑数 {
    //取余“%”，就是获取一个数除以另一个数的余数。
    //定义除以2，3，5 ，商为1 的就是丑数
    //输入: n = 10
    //输出: 12
    //解释: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 是前 10 个丑数。
    public int nthUglyNumber(int n) {
        if(n<0)
            return 0;
        int[] uglyArr = new int[n];
        uglyArr[0] = 1;
        int p2=0,p3=0,p5=0;
        for(int i =1;i<n;i++){
           int lastMaxUgly  = uglyArr[i-1];
           //哪一个数乘以2，比他自己大
           while (lastMaxUgly>=uglyArr[p2]*2)p2++;
           while (lastMaxUgly>=uglyArr[p3]*3)p3++;
           while (lastMaxUgly>=uglyArr[p5]*5)p5++;
           uglyArr[i] = Math.min(Math.min(uglyArr[p2] * 2, uglyArr[p3] * 3), uglyArr[p5] * 5);
        }
        return uglyArr[n-1];
    }

    public static void main(String[] args) {
        _49_丑数 aa = new _49_丑数();
        Integer a = aa.nthUglyNumber(10);
        System.out.println(a.toString());
    }

}