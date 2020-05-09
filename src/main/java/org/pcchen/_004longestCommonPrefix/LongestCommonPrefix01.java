package org.pcchen._004longestCommonPrefix;

/**
 * 字符串数组中最长公共前缀---my
 *
 * @author ceek
 * @create 2020-05-09 8:41
 **/
public class LongestCommonPrefix01 {
    public static void main(String[] args) {
        long timeBegin = System.currentTimeMillis();

//        System.out.println(new LongestCommonPrefix01Solution().longestCommonPrefix(new String[]{"flower","flower","flower"}));
        System.out.println(new LongestCommonPrefix01Solution().longestCommonPrefix(null));

        long timeEnd = System.currentTimeMillis();
        System.out.println("执行耗时：" + (timeEnd - timeBegin));

    }
}

class LongestCommonPrefix01Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";

        //1、假定字符串数组中最小子串为第一个字符串，字符串为null或长度为0时，返回""
        Integer minArrayIndex = strs == null || strs.length == 0 ? null : 0;
        if (null == minArrayIndex) {
            return prefix;
        }
        //2、获取字符串数组中最短字符串的索引
        for (int i = 0; i < strs.length; i++) {
            if (strs[minArrayIndex].length() > strs[i].length()) {
                minArrayIndex = i;
            }
        }

        //3、获取最长公共前缀：以最短字符串为标尺，截取子串，比较字符串数组中其它字符串中的前缀，取符合条件的最长子串
        boolean flag = false;
        for (int i = 1; i <= strs[minArrayIndex].length(); i++) {
            if (flag) {
                break;
            }
            prefix = strs[minArrayIndex].substring(0, i);
            for (int j = 0; j < strs.length; j++) {
                if (!strs[j].startsWith(prefix)) {
                    prefix = strs[minArrayIndex].substring(0, i - 1);
                    flag = true;
                }
            }
        }
        return prefix;
    }
}