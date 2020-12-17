package org.pcchen.leetcode.simple._001twonumsum;

/**
 * 求两数之和
 * 给定一个数组nums和一个目标值，找出和为目标值的两个整数，并返回数组下标
 *
 * @author ceek
 * @create 2020-05-06 8:48
 **/
public class TwoNumSum01 {
    public static void main(String[] args) {
        long timeBegin = System.currentTimeMillis();
        int[] a = new TwoNumSum01Solution().twoSum(new int[]{2, 7, 11, 15}, 9);
        long timeEnd = System.currentTimeMillis();
        System.out.println("执行耗时：" + (timeEnd - timeBegin));
        System.out.println(timeBegin);
        System.out.println(a[0] + "," + a[1]);
    }
}

class TwoNumSum01Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}