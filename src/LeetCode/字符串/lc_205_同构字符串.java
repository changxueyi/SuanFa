package LeetCode.字符串;

/**
 * @ClassName lc_205_同构字符串
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/12 9:18
 */
public class lc_205_同构字符串 {
    /**
     * 理解题意后可以发现，同构字符串等价于，来自两个字符串中的一对字符，
     * 若它们下标相同，则它们在各自字符串中第一次出现的位置也相同，
     * 满足这个要求的两个字符串就是同构字符串。
     */
    //主要就是一句话：如果这两个元素，的索引不同，就是不同
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        //通过判断索引相同不相同
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if (s.indexOf(a) != t.indexOf(b)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "egga";
        String b = "add";
        Boolean c = isIsomorphic(a, b);
        System.out.println(c);
    }
}