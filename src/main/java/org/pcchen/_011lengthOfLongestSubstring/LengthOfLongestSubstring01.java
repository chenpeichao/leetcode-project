package org.pcchen._011lengthOfLongestSubstring;

/**
 * 无重复字符串的最长子串
 * 利用滑动窗口方式挨个比对，暴力方法破解
 *
 * @author ceek
 * @create 2020-05-19 9:00
 **/
public class LengthOfLongestSubstring01 {
    public static void main(String[] args) {
        long timeBegin = System.currentTimeMillis();
        System.out.println(new LengthOfLongestSubstring01Solution().lengthOfLongestSubstring("pwwkew"));
        long timeEnd = System.currentTimeMillis();
        System.out.println("执行耗时：" + (timeEnd - timeBegin));
    }
}

class LengthOfLongestSubstring01Solution {
    public int lengthOfLongestSubstring(String s) {
        if (null == s || s.length() == 0) {
            return 0;
        }
        int length = 1;
        int max = length;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 1; i + j < s.length(); j++) {
                String substring = s.substring(i, i + j);
                String substring2 = "" + s.charAt(i + j);
                if (!substring.contains(substring2)) {
                    length = j + 1;
                    if (length > max) {
                        max = length;
                    }
                } else {
                    break;
                }
            }
        }
        return max;
    }
}