package Test2;


import java.util.Stack;

/**
 * @ClassName _23_有效的括号
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/5 14:35
 */
public class _23_有效的括号 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0 ; i<s.length();i++){
            char a = s.charAt(i);
            if (a=='('||a=='{'||a=='['){
                stack.push(a);
            }
            else {
                if (stack==null)
                    return false;
                char topChar =stack.pop();
                if (a=='}'&&topChar!='{')
                    return false;
                if (a==']'&&topChar!='[')
                    return false;
                if (a==')'&&topChar!='(')
                    return false;
            }
        }
        return stack.isEmpty();
    }
}