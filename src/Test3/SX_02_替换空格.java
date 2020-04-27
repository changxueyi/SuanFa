package Test3;

/**
 * @ClassName SX_02_替换空格
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/24 13:59
 */
public class SX_02_替换空格 {
    //传入一个字符串，如果是空格，使用%20替换
    public static String fun(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String a = "chang xue yi";
        String b = fun(a);
        System.out.println(b);
    }

}