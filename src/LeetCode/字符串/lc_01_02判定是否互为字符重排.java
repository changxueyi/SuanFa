package LeetCode.字符串;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @ClassName lc_01_02判定是否互为字符重排
 * @Description TODO https://leetcode-cn.com/problems/check-permutation-lcci/
 * @Author changxueyi
 * @Date 2020/4/14 13:42
 */
public class lc_01_02判定是否互为字符重排 {
    public static boolean CheckPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] c1 = s1.toCharArray();
        Arrays.sort(c1);
        char[] c2 = s2.toCharArray();
        Arrays.sort(c2);
        return new String(c1).equals(new String(c2));
        //或者Arrays.equals(c1, c2);
    }

    //14点13分 2020 / 4 / 14 *****************************************
    //*******************************************************************
    //**************************下面的方法，重不重要，看这个*就知道了****************************************
    //**************************************************************
    //https://qa.1r1g.com/sf/ask/3817362671/  用法见此链接
    public static boolean CheckPermutation1(String s1, String s2) {
        int[] ans = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            ans[s1.charAt(i) - 'a']++;
        }
        for (int j = 0; j < s2.length(); j++) {
            ans[s2.charAt(j) - 'a']--;
        }
        for (int k = 0; k < 26; k++) {
            if (ans[k] != 0) {
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        String s1 = "aabbcc";
        String s2 = "bbaacc";
        boolean c = CheckPermutation1(s1, s2);
        System.out.println(c);
    }

}