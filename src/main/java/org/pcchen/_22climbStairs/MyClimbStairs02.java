package org.pcchen._22climbStairs;

/**
 * 求上楼梯的总的方案个数-似斐波那契数列
 *
 * @author ceek
 * @create 2020-10-20 16:27
 **/
public class MyClimbStairs02 {
    public static void main(String[] args) {
        System.out.println(new MyClimbStairs02Solution().climbStairs(5));
    }
}

class MyClimbStairs02Solution {
    public int climbStairs(int n) {
        if (n < 2) {
            return 1;
        }

        int[] res = new int[n];
        res[0] = 1;
        res[1] = 2;

        for (int i = 2; i < n; i++) {
            res[i] = res[i - 1] + res[i - 2];
        }
        return res[n - 1];
    }
}