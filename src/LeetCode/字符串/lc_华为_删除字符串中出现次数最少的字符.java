package LeetCode.字符串;

import java.util.*;

/**
 * @ClassName lc_华为_删除字符串中出现次数最少的字符
 * @Description TODO https://blog.csdn.net/FBB360JAVA/article/details/104359423?depth_1-utm_source=distribute.pc_relevant.none-task-blog-OPENSEARCH-1&utm_source=distribute.pc_relevant.none-task-blog-OPENSEARCH-1
 * @Author changxueyi
 * @Date 2020/4/27 14:53
 */
public class lc_华为_删除字符串中出现次数最少的字符 {

    //自己写的方法
    public String fun(char[] arr) {
        if (arr == null || arr.length == 0) return null;

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length - 1; i++) {
            char c = arr[i];
            if (map.containsKey(c)) {
                int b = map.get(c);
                map.put(c, ++b);
            } else {
                map.put(c, 1);
            }
        }
        //Map中的map.keySet()方法 就是获取map的key的名称。
        //用 for (String key : params.keySet())读取map
        //KeySet():
        //将Map中所有的键存入到set集合中。因为set具备迭代器。所有可以迭代方式取出所有的键，再根据get方法。获取每一个键对应的值。
        // keySet():迭代后只能通过get()取key
        Collection<Integer> values = map.values();//工具类要常用！
        int minIndex = Collections.min(values);//直接借助collections找最值！
        StringBuffer sb = new StringBuffer();
        for (char keys : arr) {
            if(map.get(keys) != minIndex){
                sb.append(keys);
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String line = input.next();
            if (line.length() > 20) {
                continue;
            }

            int min = 20;
            int[] counts = new int[26];
            char[] chars = line.toCharArray();
            for (char aChar : chars) {
                counts[aChar - 'a']++;
                min = Math.min(min, counts[aChar - 'a']);
            }

            StringBuilder sb = new StringBuilder();
            for (char aChar : chars) {
                if (counts[aChar - 'a'] != min) {
                    sb.append(aChar);
                }
            }

            System.out.println(sb);
        }
    }
}