package org.pcchen.leetcode.simple._006kuohaostrisvalid;

/**
 * 括号字符串是否正确
 * 给定一个只包括 '('，')'，'{'，'}'，'['，'' 的字符串，判断字符串是否有效
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * <p>
 * 注意空字符串可被认为是有效字符串。
 * <p>
 * 解法：由于其满足先进后出原则，所以采用stack栈操作
 *
 * @author ceek
 * @create 2020-05-12 10:00
 **/
public class KuoHaoStrIsValid01 {
    public static void main(String[] args) {
        long timeBegin = System.currentTimeMillis();

        System.out.println(new KuoHaoStrIsValid01Solution().isValid("()"));

        long timeEnd = System.currentTimeMillis();
        System.out.println("执行耗时：" + (timeEnd - timeBegin));

    }
}

class KuoHaoStrIsValid01Solution {
    public boolean isValid(String s) {
        if (null == s || s.equals("")) {
            return true;
        }
        if (s.contains("()") || s.contains("[]") || s.contains("{}")) {
            return isValid(s.replace("()", "").replace("[]", "").replace("{}", ""));
        }
        return false;
    }
}