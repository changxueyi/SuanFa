package LeetCode.字符串;

/**
 * @ClassName _01_判断是否是回文字符串
 * @Description TODO  此题自己写的，非leetcode
 * @Author changxueyi
 * @Date 2020/4/22 14:00
 */
public class _01_判断是否是回文字符串 {
    // 如果一个英语单词，正着读，反着读都是一个单词，就是回文字符串
    public static boolean isPalindrome(String s) {
        //把所有英文字母统一转为小写，然后将所有字母数字以外的字符去掉
        s = s.toLowerCase().replaceAll("[^0-9a-z]", "");
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1))
                return false;
        }
        return true;
    }

    //15点36分 2020/5/11
    public static boolean fun(String s) {
        if (s.length() == 0) {
            return false;
        }
        int size = s.length();
        for (int i = 0; i < size / 2; i++) {
            if (s.charAt(i)!=s.charAt(size-i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("changxueyi"));
        System.out.println(fun("chang"));
    }
}