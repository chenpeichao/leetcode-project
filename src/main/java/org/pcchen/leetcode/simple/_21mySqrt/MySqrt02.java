package org.pcchen.leetcode.simple._21mySqrt;

/**
 * 求解平方根
 *
 * @author ceek
 * @create 2020-10-13 16:36
 **/
public class MySqrt02 {
    public static void main(String[] args) {
        System.out.println(new MySqrt02Solution().mySqrt(2147395598));
    }
}

class MySqrt02Solution {
    public int mySqrt(int x) {
        long l = 0;
        long r = x;
        while (l <= r) {
            long mid = (l + r) / 2;
            long temp = mid * mid;
            if (temp < x) {
                l = mid + 1;
            } else if (temp > x) {
                r = mid - 1;
            } else {
                return (int) mid;
            }
        }
        return (int) r;
    }
}