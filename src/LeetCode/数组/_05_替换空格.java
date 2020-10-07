package LeetCode.数组;

/**
 * @ClassName _05_替换空格https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/
 * @Description 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 * 限制： 0 <= s 的长度 <= 10000
 * @Author changxueyi
 * @Date 2020/2/18 16:02
 */
public class _05_替换空格 {
    public String replaceSpace(String s) {
        String str1 = s.toString();
        if (str1.equals(""))
            return str1;
        char[] strArray = str1.toCharArray();// toCharArry()：把字符串转为char字符数组；
        ////例如：
        //  String str = "abc";
        // char[] arr = str.toCharArray();
        // //输出
        // [a, b, c]
        int i = 0;
        int lengthSpace = 0;
        while (i < strArray.length) {
            if (strArray[i] == ' ')
                lengthSpace++;
            i++;
        }
        int newStrLength = strArray.length + lengthSpace * 2;
        char[] newStr = new char[newStrLength];
        int j = newStrLength - 1;
        i = strArray.length - 1;
        while (i >= 0) {
            if (strArray[i] != ' ') {
                newStr[j--] = strArray[i--];
            } else {
                newStr[j--] = '0';
                newStr[j--] = '2';
                newStr[j--] = '%';
                i--;
            }
        }
        return new String((newStr));
    }

    //方法二,最简单的方法
    //创建一个springbuilder对象，一个字符一个字符的添加，如果是一个正常元素就加进来
    //否则，使用append加进去
    //拓展：使用stringbuilder效率更高，但是不安全
    public String replaceSpace1(String s) {
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

    //10点08分 2020/3/12
    public String replaceSpace2(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            //真香警告，这里是单字符，不要弄成双字符
            if (c == ' ')
                sb.append("%20");
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    //18点34分 2020/07/21
    public String replaceSpace3(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ')
                sb.append("%20");
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /**
     * 北京京东集团
     * 18点09分 2020/9/22
     */
    public static String replaceSpace4(String s) {
        if (s == null || s.length() == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sb.append("%20");
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String target = "chang xue yi ";
        String result  = replaceSpace4(target);
        System.out.println(result);
    }
}