package org.pcchen.leetcode.simple._004longestCommonPrefix;

/**
 * 字符串数组中最长公共前缀---nice
 *
 * @author ceek
 * @create 2020-05-09 9:46
 **/
public class LongestCommonPrefix02 {
    public static void main(String[] args) {
        long timeBegin = System.currentTimeMillis();

//        System.out.println(new LongestCommonPrefix02Solution().longestCommonPrefix(new String[]{"flower","flosp","flabc","flower"}));
        System.out.println(new LongestCommonPrefix02Solution().longestCommonPrefix(new String[]{"flower"}));
        System.out.println(new LongestCommonPrefix02Solution().longestCommonPrefix(null));

        long timeEnd = System.currentTimeMillis();
        System.out.println("执行耗时：" + (timeEnd - timeBegin));

    }
}

class LongestCommonPrefix02Solution {
    //先取出第一个字符串(有的情况下)；比较第一个字符串和后面一个字符串的公共前缀，然后用这个公共前缀去和后面的字符串比较；
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";

        if (null == strs || strs.length == 0) {
            return prefix;
        }

        prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            for (; j < prefix.length() && j < strs[i].length(); j++) {
                if (prefix.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
            }
            prefix = strs[i].substring(0, j);
        }

        return prefix;
    }
}