package Test.测试;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @ClassName _05_替换空格
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/24 10:00
 */
public class _05_替换空格 {
    public String replaceSpace(String s) {
        StringBuilder str  = new StringBuilder();
        for (int i = 0;i<s.length();i++){
            char a = s.charAt(i);
            if (a == ' '){
                str.append("%20");
            }else {
                str.append(a);
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        _05_替换空格 aaa = new _05_替换空格();
        System.out.println(aaa.replaceSpace("chang xue yi"));
    }
}