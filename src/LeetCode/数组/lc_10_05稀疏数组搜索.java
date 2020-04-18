package LeetCode.数组;

/**
 * @ClassName lc_10_05稀疏数组搜索
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/18 21:33
 */
public class lc_10_05稀疏数组搜索 {

    //这个方法比较流氓，建议使用分治算法
    //建议参考 https://leetcode-cn.com/problems/sparse-array-search-lcci/solution/er-fen-fa-cha-zhao-by-boyka/
    public int findString(String[] words, String s) {
        for (int i =0;i<words.length;i++){
            if (s.equals(words[i]))
                return i;
        }
        return -1;
    }
}