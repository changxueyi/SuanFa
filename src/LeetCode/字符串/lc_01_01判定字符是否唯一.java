package LeetCode.字符串;

import java.util.HashSet;

/**
 * @ClassName lc_01_01判定字符是否唯一
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/14 10:55
 */
public class lc_01_01判定字符是否唯一 {
    public boolean isUnique(String astr) {
        HashSet<Character> hashSet = new HashSet<>();
        for (int i = 0; i < astr.length(); i++) {
            char c = astr.charAt(i);
            if (hashSet.contains(c)){
                return false;
            }else {
                hashSet.add(c);
            }
        }
        return true;
    }
}