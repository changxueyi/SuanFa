package LeetCode.字符串;

/**
 * @ClassName __数字转中文
 * @Description TODO 非leetcode题
 * @Author changxueyi
 * @Date 2020/5/4 9:52
 */
public class __数字转中文 {


    public static String int2chineseNum(int src) {
        final String num[] = {"零", "一", "二", "三", "四", "五", "六", "七", "八", "九"};
        final String unit[] = {"", "十", "百", "千", "万", "十", "百", "千", "亿", "十", "百", "千"};
        String dst = "";
        int count = 0;
        while (src > 0) {
            dst = (num[src % 10] + unit[count]) + dst;
            src = src / 10;
            count++;
        }
        return dst.replaceAll("零[千百十]", "零").replaceAll("零+万", "万")
                .replaceAll("零+亿", "亿").replaceAll("亿万", "亿零")
                .replaceAll("零+", "零").replaceAll("零$", "");
    }

    public static void main(String[] args) {
        String result = int2chineseNum(99);
        System.out.println(result);
    }

}