package org.pcchen.leetcode.simple._014longestPalindrome;

/**
 * 获取字符串最长的回文串
 * 暴力法-破解
 *
 * @author ceek
 * @create 2020-05-25 9:21
 **/
public class LongestPalindrome01 {
    public static void main(String[] args) {
        long timeBegin = System.currentTimeMillis();
        System.out.println(new LongestPalindrome01Solution().longestPalindrome("babad"));
        long timeEnd = System.currentTimeMillis();
        System.out.println("执行耗时：" + (timeEnd - timeBegin));
    }
}

class LongestPalindrome01Solution {
    public String longestPalindrome(String s) {
        if (null == s || s.length() == 0) {
            return "";
        }
        int index = 0;  //定义回文数起始位置
        int length = 1; //定义回文数长度

        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 2; j <= s.length(); j++) {
                String substring = s.substring(i, j);
                if (substring.length() > length && isPalindrome(substring)) {
                    length = s.substring(i, j).length();
                    index = i;
                }
            }
        }
        return s.substring(index, index + length);
    }

    public boolean isPalindrome(String str) {
        for (int i = 0, j = str.length() - 1; i <= j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}