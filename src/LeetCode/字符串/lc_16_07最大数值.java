package LeetCode.字符串;

import java.util.Arrays;

/**
 * @ClassName lc_16_07最大数值
 * @Description TODO https://leetcode-cn.com/problems/maximum-lcci/
 * @Author changxueyi
 * @Date 2020/4/14 10:59
 */
public class lc_16_07最大数值 {
    public int maximum(int a, int b) {
        return Math.max(a, b);
    }
    //方法二 return a>b?a:b;
    //方法三：
    public int maximum1(int a, int b) {
        int [] num=new int[2];
        num[0]=a;
        num[1]=b;
        Arrays.sort(num);
        return num[1];
    }

    //真正的方法

    /**
     *
     * 判断a-b为正数还是负数,int类型负数首位为1，正数为0
     * 所以右移31位 得到正负数 0或1 然后与a，b相乘得结果
     * 由于溢出问题，int转为long进行右移
     */
    public int maximum2(int a, int b) {
        long c=a;long d=b;
        int res=(int)((c-d)>>>63);// >>>和>>区别 >>>无符号右移
        return b*res+a*(res^1);
    }





}