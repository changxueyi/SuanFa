package LeetCode.字符串;

/**
 * @ClassName lc344_反转字符串
 * @Description TODO https://leetcode-cn.com/problems/reverse-string/
 * @Author changxueyi
 * @Date 2020/4/22 21:09
 */
public class lc344_反转字符串 {
    public void reverseString(char[] s) {
        //使用双指针
        int j = s.length - 1;
        for (int i = 0; i < s.length / 2; i++) {
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
            j--;
        }
    }

    public void revers(char[] s) {
        int j = s.length - 1;
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[j - i - 1];
            s[j - i - 1] = temp;
        }
    }
}