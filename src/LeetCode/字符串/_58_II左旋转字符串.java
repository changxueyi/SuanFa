package LeetCode.字符串;

import netscape.security.UserTarget;

import java.util.Arrays;
import java.util.Stack;

/**
 * @ClassName _58_II左旋转字符串
 * @Description TODO https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/
 * @Author changxueyi
 * 输入: s = "abcdefg", k = 2
 * 输出: "cdefgab"
 * @Date 2020/4/10 12:40
 */
public class _58_II左旋转字符串 {
    public static String reverseLeftWords(String s, int n) {
        /**
         * 我的思路：遍历一遍这个字符串的长度，StringBuilder 直接添加到最后面即可
         */
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = n; i < s.length(); i++) {
            char a = s.charAt(i);
            stringBuilder.append(a);
        }
        for (int i = 0; i < n; i++) {
            char a = s.charAt(i);
            stringBuilder.append(a);
        }
        return stringBuilder.toString();
    }

    //牛人的一行代码升天
    public static String reverseLeftWords1(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }

    //牛人的一行代码升天2  真正的双100%
    public static String reverseLeftWords2(String s, int n) {
        String s1 = s.substring(0, n);
        String s2 = s.substring(n, s.length());
        return s2 + s1;
    }

    //16点00分 2020 /5 /11 再战
    public static String reverseLeftWords3(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = n; i < s.length(); i++) {
            char c = s.charAt(i);
            sb.append(c);
        }
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String ss = "changxueyi";
        int n = 5;
        //      String aa = reverseLeftWords(ss, n);
        //    System.out.println(aa);
        String dd = ss.substring(5);
        System.out.println(dd);
        System.out.println("*************");
        String bb = reverseLeftWords1(ss, n);
        System.out.println(bb);
        System.out.println("****************");
        String cc = reverseLeftWords2(ss, n);
        System.out.println(cc);
        System.out.println("/*/*/*/*/*/*/*/*/");
        String ee = reverseLeftWords3(ss, 2);
        System.out.println(ee);
    }
}