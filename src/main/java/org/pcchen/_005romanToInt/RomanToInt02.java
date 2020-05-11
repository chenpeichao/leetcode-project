package org.pcchen._005romanToInt;

/**
 * 落马数字转整数
 *
 * @author ceek
 * @create 2020-05-11 10:19
 **/
public class RomanToInt02 {
    public static void main(String[] args) {
        long timeBegin = System.currentTimeMillis();

        System.out.println(new RomanToInt02Solution().romanToInt("MCMXCIV"));

        long timeEnd = System.currentTimeMillis();
        System.out.println("执行耗时：" + (timeEnd - timeBegin));

    }
}

class RomanToInt02Solution {
    public int romanToInt(String s) {
        int sum = 0;

        int pref = getRomanIntValue(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (pref < getRomanIntValue(s.charAt(i))) {
                sum -= pref;
            } else {
                sum += pref;
            }
            pref = getRomanIntValue(s.charAt(i));
        }

        sum += pref;
        return sum;
    }

    public int getRomanIntValue(char a) {
        switch (a) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}