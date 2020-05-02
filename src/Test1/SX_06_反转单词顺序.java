package Test1;

/**
 * @ClassName SX_06_反转单词顺序
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/29 14:06
 */
public class SX_06_反转单词顺序 {
    public String reverseWords(String s) {
        if (s == null) return "";
        int b = s.length() - 1;
        int a = b;
        StringBuilder res = new StringBuilder();
        while (a >= 0) {
            while (a > 0 && s.charAt(a) != ' ') a--;
            res.append(s.substring(a + 1, b + 1) + " ");
            while (a >= 0 && s.charAt(a) == ' ') a--; // 跳过单词间空格
            b = a; // j 指向下个单词的尾字符
        }
        return res.toString();
    }
}