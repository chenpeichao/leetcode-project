package org.pcchen.leetcode.simple._009strStr;

/**
 * a字符串是否包含b字符串，并输出其实包含位置，从0开始
 * a = hello; b = lo
 * 输出：3
 * <p>
 * 不包含则输出-1
 *
 * @author ceek
 * @create 2020-05-15 9:45
 **/
public class StrStr02 {
    public static void main(String[] args) {
        long timeBegin = System.currentTimeMillis();
        "hello".indexOf("lo");
        System.out.println(new StrStr02Solution().strStr("aaa", "aaaa"));
        long timeEnd = System.currentTimeMillis();
        System.out.println("执行耗时：" + (timeEnd - timeBegin));
    }
}

class StrStr02Solution {
    public int strStr(String haystack, String needle) {
        return -1;
//        if(null == needle || "".equals(needle)) {
//            return 0;
//        }
//        if(null == haystack || "".equals(haystack) || needle.length() > haystack.length()) {
//            return -1;
//        }
//
//        int hlen = haystack.length();
//        int nlen = needle.length();
//
//        boolean flag = true;
//        int i = 0;
//        for(; i < hlen - nlen; i++) {
//            for(int j = 0; j < nlen; j++) {
//                if(haystack.charAt(i + j) != needle.charAt(j)) {
//                    flag = false;
//                    break;
//                }
//            }
//            if(flag) {
//                break;
//            }
//            if(i != hlen - nlen - 1) {
//                flag = true;
//            }
//        }
//        return flag ? i : -1;
    }
}