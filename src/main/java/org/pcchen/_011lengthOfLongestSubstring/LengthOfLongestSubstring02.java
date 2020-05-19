package org.pcchen._011lengthOfLongestSubstring;

import java.util.HashSet;
import java.util.Set;

/**
 * 无重复字符串的最长子串
 *
 * @author ceek
 * @create 2020-05-19 11:33
 **/
public class LengthOfLongestSubstring02 {
    public static void main(String[] args) {
        long timeBegin = System.currentTimeMillis();
        System.out.println(new LengthOfLongestSubstring02Solution().lengthOfLongestSubstring("pbxwewac"));
        long timeEnd = System.currentTimeMillis();
        System.out.println("执行耗时：" + (timeEnd - timeBegin));
    }
}

/**
 * 左指针(变量i)：用来控制主串，当右指针指向重复数值时，左指针控制右移，来使字符串排除此重复字符串
 * 右指针(变量leftIndex)：用来添加字符，并指向到重复的字符串
 * <p>
 * 当判断到有重复数据时，左指针一步一步向右移动，排除重复字符串后，左指针在向后移动，新字符串长度即为右指针指标减去左指针指标(因为while中已经index++了，所以不用再+1了)
 */
class LengthOfLongestSubstring02Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> containsCharSet = new HashSet<Character>();

        int max = 0;
        //定义右指针
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            //i为左指针
            if (i != 0) {
                containsCharSet.remove(s.charAt(i - 1));
            }

            while (index < s.length() && !containsCharSet.contains(s.charAt(index))) {
                containsCharSet.add(s.charAt(index));
                index++;
            }

            max = Math.max(index - i, max);
        }
        return max;
    }
}