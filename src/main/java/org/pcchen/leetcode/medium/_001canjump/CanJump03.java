package org.pcchen.leetcode.medium._001canjump;

/**
 * 官方贪心算法解决
 * 依次向后遍历数组中每一个值，取出其中最大的一个，并且数组索引不能大于最大的flag值
 *
 * @author ceek
 * @create 2021-02-03 16:40
 **/
public class CanJump03 {
    public static void main(String[] args) {
        int a[] = new int[]{3, 2, 1, 0, 4};
        System.out.println(new CanJump03Solution().canJump(a));
    }
}

class CanJump03Solution {
    public boolean canJump(int[] nums) {
        int rightFlag = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i <= rightFlag) {
                rightFlag = Math.max(rightFlag, nums[i] + i);
                if (rightFlag >= nums.length - 1) {
                    return true;
                }
            }
        }
        return false;
    }
}