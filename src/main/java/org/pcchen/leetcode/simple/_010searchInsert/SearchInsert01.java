package org.pcchen.leetcode.simple._010searchInsert;

/**
 * 搜索插入---暴力方法
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置
 *
 * @author ceek
 * @create 2020-05-18 15:08
 **/
public class SearchInsert01 {
    public static void main(String[] args) {
        long timeBegin = System.currentTimeMillis();
        System.out.println(new SearchInsert01Solution().searchInsert(new int[]{1, 3, 5, 6}, 2));
        long timeEnd = System.currentTimeMillis();
        System.out.println("执行耗时：" + (timeEnd - timeBegin));
    }
}

class SearchInsert01Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target) {
                return i;
            }
        }
        return nums.length;
    }
}