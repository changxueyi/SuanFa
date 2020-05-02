package LeetCode.leetcode精选TOP100;

/**
 * @ClassName lc_14_最长公共前缀
 * @Description TODO https://leetcode-cn.com/problems/longest-common-prefix/solution/hua-jie-suan-fa-14-zui-chang-gong-gong-qian-zhui-b/
 * @Author changxueyi
 * @Date 2020/4/30 15:43
 */
public class lc_14_最长公共前缀 {

    //此题自己未做出来
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";
        String ans = strs[0];
        for(int i =1;i<strs.length;i++) {
            int j=0;
            for(;j<ans.length() && j < strs[i].length();j++) {
                if(ans.charAt(j) != strs[i].charAt(j))
                    break;
            }
            ans = ans.substring(0, j);
            if(ans.equals(""))
                return ans;
        }
        return ans;
    }
}