package LeetCode.数组;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @ClassName lc_242_有效的字母异位词
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/12 9:10
 */
public class lc_242_有效的字母异位词 {

    /***
     * ********************下面是没有跑通的代码 ***************************************
     */
    public static boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            //https://blog.csdn.net/Vince_Wang1/article/details/103868451?depth_1-utm_source=distribute.pc_relevant.none-task-blog-OPENSEARCH-2&utm_source=distribute.pc_relevant.none-task-blog-OPENSEARCH-2
            //map.getOrdefault(a,b),就是设置值，当a存在，时候，key就是原来的值，也就是a，不存在，则，设置为0，
            map.put(a, map.getOrDefault(a,0)+1);
        }
        //校对t字符串
        for(int i=0; i<t.length(); i++){
            char c = t.charAt(i);
            if(!map.containsKey(c)) return false;    //这种方法的好处体现在这，如果发现有不一样的就直接返回了
            map.put(c, map.get(c)-1);
        }
        //检查map
        for(Character c: map.keySet()){
            if(map.get(c)!=0) return false;
        }
        return true;
    }




    public static void main(String[] args) {
        String a = "aacc";
        String b = "ccac";
        Boolean c = isAnagram(a, b);
        System.out.println(c);

    }
}