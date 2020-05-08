package org.pcchen._003palindrome;

/**
 * 回文数
 * <p>
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数
 * 121是；-121不是
 *
 * @author ceek
 * @create 2020-05-08 9:11
 **/
public class Palindrome01 {
    public static void main(String[] args) {
        long timeBegin = System.currentTimeMillis();

        System.out.println(new Palindrome01Solution().isPalindrome(2147483647));

        long timeEnd = System.currentTimeMillis();
        System.out.println("执行耗时：" + (timeEnd - timeBegin));
    }
}

class Palindrome01Solution {
    public boolean isPalindrome(int x) {
        int reverse = x;

        //此处定义为long型，用于区别反转后不是回文数的值溢出，影响回文数的正常判断
        long tmp = 0;
        if (x < 0) {
            return false;
        }

        while (x != 0) {
            tmp = tmp * 10 + x % 10;
            if (tmp > Integer.MAX_VALUE) {
                return false;
            }
            x = x / 10;
        }

        return tmp == reverse;
    }
}