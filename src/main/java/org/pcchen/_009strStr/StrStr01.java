package org.pcchen._009strStr;

/**
 * a字符串是否包含b字符串，并输出其实包含位置，从0开始
 * a = hello; b = lo
 * 输出：3
 * <p>
 * 不包含则输出-1
 *
 * @author ceek
 * @create 2020-05-15 9:15
 **/
public class StrStr01 {
    public static void main(String[] args) {
        long timeBegin = System.currentTimeMillis();

        System.out.println(new StrStr01Solution().strStr("hello", "lo"));
        long timeEnd = System.currentTimeMillis();
        System.out.println("执行耗时：" + (timeEnd - timeBegin));
    }
}

class StrStr01Solution {
    public int strStr(String haystack, String needle) {
        if (null == needle || "".equals(needle)) {
            return 0;
        }
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0) && haystack.length() - i >= needle.length() && haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}