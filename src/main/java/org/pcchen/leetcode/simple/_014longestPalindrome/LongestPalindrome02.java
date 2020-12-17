package org.pcchen.leetcode.simple._014longestPalindrome;

/**
 * 获取字符串最长的回文串
 * 中心扩散法
 *
 * @author ceek
 * @create 2020-05-25 13:58
 **/
public class LongestPalindrome02 {
    public static void main(String[] args) {
        long timeBegin = System.currentTimeMillis();
        System.out.println(new LongestPalindrome02Solution().longestPalindrome("babad"));
        long timeEnd = System.currentTimeMillis();
        System.out.println("执行耗时：" + (timeEnd - timeBegin));
    }
}

class LongestPalindrome02Solution {
    public String longestPalindrome(String s) {
        if (null == s || s.length() < 1) {
            return "";
        }
        int maxLen = 1;
        String res = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            //对于最终结果中回文数是奇数的
            String singleStr = palindromeStr(s, i, i);
            //对于最终结果中回文数是偶数的
            String doubleStr = palindromeStr(s, i, i + 1);
            String resTmp = singleStr.length() > doubleStr.length() ? singleStr : doubleStr;
            if (resTmp.length() > maxLen) {
                maxLen = resTmp.length();
                res = resTmp;
            }
        }
        return res;
    }

    public String palindromeStr(String str, int left, int right) {
        while (left >= 0 && right < str.length()) {
            if (str.charAt(left) == str.charAt(right)) {
                left--;
                right++;
            } else {
                break;
            }
        }
        return str.substring(left + 1, right);
    }
}