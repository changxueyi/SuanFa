package Test.动态数组;

/**
 * @ClassName _05_替换空格
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/2/19 21:39
 */
public class _05_替换空格 {
    public String replaceSpace(String s) {
        StringBuilder str= new StringBuilder();
        for (int i= 0;i<s.length();i++){
            int a= s.charAt(i);
            if (a ==' '){
                str.append("%20");
            }else {
                str.append(a);
            }
    }
        return str.toString();
}
}