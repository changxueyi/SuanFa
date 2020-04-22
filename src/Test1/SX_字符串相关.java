package Test1;

import java.util.HashMap;

/**
 * @ClassName SX_字符串相关
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/21 16:48
 */
public class SX_字符串相关 {
    //面试题50. 第一个只出现一次的字符
    public char fun(String s) {
        if (s.length() == 0 || s == null)
            return ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.get(c) != null) {
                int nums = map.get(c);
                if (nums >= 1)
                    map.put(c, nums + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.get(c) == 1) {
                return c;
            }
        }
        return ' ';
    }

    //面试题58 - II. 左旋转字符串
    //字符串拼接
    public String fun01(String s, int n) {
        StringBuilder res = new StringBuilder();
        for (int i = n; i < s.length(); i++) {
            res.append(s.charAt(i));
        }
        for (int j = 0; j < n; j++) {
            res.append(s.charAt(j));
        }
        return res.toString();
    }


}