package LeetCode.栈;

import java.util.Stack;

/**
 * @ClassName _20_有效的括号
 * @Description https://leetcode-cn.com/problems/valid-parentheses/
 * @Author changxueyi
 * @Date 2020/2/13 23:07
 */
public class _20_有效的括号 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{')
                stack.push(c);
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
        }return stack.isEmpty();
    }
    public static void main(String[] args) {
      /*  char arr[];
        arr = new char[]{'[','{','(',']','}',')'};*/
        System.out.println(new _20_有效的括号().isValid("[[)){}"));
    }
}