package Test2;

/**
 * @ClassName _03_替换空格
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/3 13:44
 */
public class _03_替换空格 {
    //
    public String replaceSpace(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                stringBuilder.append("%20");
            } else {
                stringBuilder.append(c);
            }
        }
        return s;
    }
}