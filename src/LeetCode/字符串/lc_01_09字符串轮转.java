package LeetCode.字符串;

/**
 * @ClassName lc_01_09字符串轮转
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/19 16:56
 */
public class lc_01_09字符串轮转 {
    public boolean isFlipedString(String s1, String s2) {
       // 旋转体的规律为：一个旋转体的两倍必定包含另一个旋转体

        if (s1.length()!=s2.length()){
            return false;
        }
        if (s1.equals(s2)){
            return true;
        }
        s1+=s1;
        return s1.contains(s2);
    }
}