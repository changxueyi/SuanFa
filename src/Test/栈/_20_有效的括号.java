package Test.栈;
import java.util.Stack;
/**
 * @ClassName _20_有效的括号
 * @Description TODO
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * @Author changxueyi
 * @Date 2020/2/19 22:45
 */
public class _20_有效的括号 {
    public boolean isValid(String s) {
        if (s=="null"||s==" ")
            return false;
        Stack<Character> stack = new Stack<>();
       for (int i=0;i<=s.length();i++){
           char c = s.charAt(i);
           if (c == '(' || c == '[' || c == '{')
               stack.push(c);
           else {
               char topChar = stack.pop();
               if (c=='}'&&topChar != '('){
                   return false;
               }
               if (c==']'&&topChar!='[')
                   return false;
               if (c==')'&&topChar!=')')
                   return false;
           }
       }
        return s.isEmpty();
    }
}