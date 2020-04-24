package LeetCode.字符串;

import java.util.Calendar;
import java.util.HashSet;

/**
 * @ClassName lc_01_04回文排列
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/19 17:39
 */
public class lc_01_04回文排列 {
    //每个字符出现的次数为偶数, 或者有且只有一个字符出现的次数为奇数时, 是回文的排列; 否则不是.
    public boolean canPermutePalindrome(String s) {
        //消消乐思想，遍历，如果set集合汇总有当前字符，消除它，没有添加它、
        if (s == null || s.length() < 1) {
            return false;
        }
        char[] chars = s.toCharArray();
        HashSet<Character> set = new HashSet<Character>();
        for (Character character : chars) {
            if (set.contains(character)){
                set.remove(character);
            }else {
                set.add(character);
            }
        }
        return set.size()<=1;
    }
}