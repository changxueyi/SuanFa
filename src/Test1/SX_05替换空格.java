package Test1;

/**
 * @ClassName SX_05替换空格
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/21 9:01
 */
public class SX_05替换空格 {
    public static String fun(String s) {
        if (s.length() == 0 || s == null)
            return null;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char  c = s.charAt(i);
            if (c==' '){
                sb.append("%20");
            }else {
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