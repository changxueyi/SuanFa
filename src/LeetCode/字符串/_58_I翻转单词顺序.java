package LeetCode.字符串;

/**
 * @ClassName _58_I翻转单词顺序
 * @Description TODO https://leetcode-cn.com/problems/fan-zhuan-dan-ci-shun-xu-lcof/solution/mian-shi-ti-58-i-fan-zhuan-dan-ci-shun-xu-shuang-z/
 * @Author changxueyi
 * @Date 2020/4/11 15:31
 */
public class _58_I翻转单词顺序 {
    public String reverseWords(String s) {
        s = s.trim(); // 删除首尾空格
        int j = s.length() - 1, i = j;
        StringBuilder res = new StringBuilder();
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) != ' ') i--; // 搜索首个空格
            res.append(s.substring(i + 1, j + 1) + " "); // 添加单词
            while (i >= 0 && s.charAt(i) == ' ') i--; // 跳过单词间空格
            j = i; // j 指向下个单词的尾字符
        }
        return res.toString().trim(); // 转化为字符串并返回
    }

    //14点15分 2020/4/22 再战反转单词顺序
    // hello word
    // 0123456789
    public static String fun(String s) {
        s = s.trim();
        int j = s.length() - 1;
        int i = j;
        StringBuilder res = new StringBuilder();
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) != ' ') i--;// 搜索首个空格
            res.append(s.substring(i + 1, j + 1) + " ");// 添加单词
            while (i >= 0 && s.charAt(i) == ' ') i--; // 跳过单词间空格
            j = i; // j 指向下个单词的尾字符
        }
        //这个位置必须是加上这个trim
        return res.toString().trim();
    }

    public static void main(String[] args) {
        String s = "chang xue yi";
        String a = fun(s);
        System.out.println(a);
    }


}