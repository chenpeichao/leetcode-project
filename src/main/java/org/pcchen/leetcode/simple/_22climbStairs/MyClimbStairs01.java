package org.pcchen.leetcode.simple._22climbStairs;

/**
 * 求上楼梯的总的方案个数--类似于菲波那切数列，使用递归进行数据遍历
 * 问题：当楼梯过高会有超时问题
 *
 * @author ceek
 * @create 2020-10-19 16:21
 **/
public class MyClimbStairs01 {
    public static void main(String[] args) {
        System.out.println(new MyClimbStairs01Solution().climbStairs(6));
    }
}

class MyClimbStairs01Solution {
    public int climbStairs(int n) {
        if (n < 2) {
            return 1;
        } else {
            return climbStairs(n - 2) + climbStairs(n - 1);
        }
    }
}