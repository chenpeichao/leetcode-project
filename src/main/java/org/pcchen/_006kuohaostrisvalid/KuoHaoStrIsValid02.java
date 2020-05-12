package org.pcchen._006kuohaostrisvalid;

import java.util.Stack;

/**
 * @author ceek
 * @create 2020-05-12 15:54
 **/
public class KuoHaoStrIsValid02 {
    public static void main(String[] args) {
        long timeBegin = System.currentTimeMillis();

        System.out.println(new KuoHaoStrIsValid02Solution().isValid("(]"));

        long timeEnd = System.currentTimeMillis();
        System.out.println("执行耗时：" + (timeEnd - timeBegin));

    }
}

class KuoHaoStrIsValid02Solution {
    public boolean isValid(String s) {
        if (null == s || "".equals(s)) {
            return true;
        }
        Stack<Character> stack = new Stack<Character>();

        for (char c : s.toCharArray()) {
            if ('(' == c) {
                stack.push(')');
            } else if ('[' == c) {
                stack.push(']');
            } else if ('{' == c) {
                stack.push('}');
            } else if (stack.empty() || c != stack.pop()) {
                //此处stack.empty()，用来验证有多余的关闭括号，没有匹配到入栈或者栈没数据时的异常
                return false;
            }
        }
        return stack.empty();
    }
}