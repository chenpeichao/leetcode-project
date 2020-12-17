package org.pcchen.leetcode.simple._21mySqrt;

/**
 * 求解平方根
 * 暴力法求解，求解一半值
 *
 * @author ceek
 * @create 2020-10-12 16:24
 **/
public class MySqrt01 {
    public static void main(String[] args) {
        System.out.println(new MySqrt01Solution().mySqrt(2147395599));
    }
}

class MySqrt01Solution {
    public int mySqrt(int x) {
        int half = x / 2 + 1;
        int i = 0;
        for (; i <= half; i++) {
            if (i * i == x) {
                return i;
            }

            if (i * i > x) {
                return --i;
            }
            if (i == 46340) {
                return 46340;
            }
        }
        return 1;
    }
}