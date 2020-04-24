package LeetCode.字符串;

import 并发泛型反射.多线程同步.HashMapThread;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName _50_第一个只出现一次的字符
 * @Description TODO https://leetcode-cn.com/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof/submissions/
 * @Author changxueyi
 * @Date 2020/4/10 10:14
 */
public class _50_第一个只出现一次的字符 {
    //自己研究的骚操作
    public static char firstUniqChar(String s) {
        if (s == null || s.length() == 0) {
            return ' ';
        }
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.get(c) != null) {
                int nums = map.get(c);
                //在次数超出 1 次之后，nums 再增加没意义，干脆节省一次put操作
                if (nums <= 1) {
                    //map.put(c,nums++)  这样写为什么就跑不通过了
                    map.put(c, nums + 1);
                }
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


    public static void main(String[] args) {
        String s = "loveleetcode";
        char a = firstUniqChar(s);
        System.out.println(a);

    }

}