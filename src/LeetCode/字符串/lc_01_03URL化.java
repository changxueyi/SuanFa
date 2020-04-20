package LeetCode.字符串;

/**
 * @ClassName lc_01_03URL化
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/19 13:24
 */
public class lc_01_03URL化 {
    //注意题目提供了一个lenth  ，循环的时候，结束条件应该是length
    public String replaceSpaces(String S, int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char c = S.charAt(i);
            if (c == ' ') {
                sb.append("%20");

            } else {
                sb.append(c);

            }
        }
        return sb.toString();
    }
}