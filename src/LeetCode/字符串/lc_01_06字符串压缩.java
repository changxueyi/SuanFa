package LeetCode.字符串;

import java.util.HashMap;

/**
 * @ClassName lc_01_06字符串压缩
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/22 15:47
 */
public class lc_01_06字符串压缩 {
    public String compressString(String s) {
        return "changxueyi";
    }

    public static String toLowerCase(String str) {
        String str1=str.toLowerCase();
        return str1;
    }

    public static void main(String[] args) {
        String c = "chang xue yi";
        char[] a = c.toCharArray();

        char b = a[0];
        char d = a[5];
        System.out.print("返回值 :");
        System.out.println(c.toCharArray());
        System.out.println(b);
        System.out.println(d + "d");
        System.out.println("***************");
        String e = "Changxueyi";
        System.out.println(toLowerCase(e));
    }
}