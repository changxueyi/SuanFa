package 算法_Algorithms.第一章;

/**
 * @ClassName _1_2_2_3字符串
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/22 10:56
 */
public class _1_2_2_3字符串 {
    //判断是否是回文字符串
    public static boolean isPalindrome(String s) {
        int N = s.length();
        for (int i = 0; i < N / 2; i++) {
            if (s.charAt(i)!=s.charAt(N-1-i))
                return false;
        }
        return true;
    }
}