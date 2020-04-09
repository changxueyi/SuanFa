package Test2;

import java.util.Stack;

/**
 * @ClassName _19_括号匹配
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/8 16:42
 */
public class _19_括号匹配 {
    public boolean pipei(String s) {
        if (s == null || s.length() == 0)
            return false;
        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
           if (c=='{'||c=='('||c=='['){
               stack.push(c);
           }
           else {
               if (stack.isEmpty())
                   return false;
               char topChar = stack.pop();
               if (c == ')' && topChar != '(')
                   return false;
               if (c == ']' && topChar != '[')
                   return false;
               if (c == '}' && topChar != '{')
                   return false;
           }
        }
        return stack.isEmpty();
    }
}