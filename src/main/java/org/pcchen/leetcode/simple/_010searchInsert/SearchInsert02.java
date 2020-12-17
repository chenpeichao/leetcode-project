package org.pcchen.leetcode.simple._010searchInsert;

/**
 * 搜索插入---二分查找
 * 时间复杂度为O（logn）
 *
 * @author ceek
 * @create 2020-05-18 16:22
 **/
public class SearchInsert02 {
    public static void main(String[] args) {
        long timeBegin = System.currentTimeMillis();
        System.out.println(new SearchInsert02Solution().searchInsert(new int[]{1, 3, 5, 6}, 2));
        long timeEnd = System.currentTimeMillis();
        System.out.println("执行耗时：" + (timeEnd - timeBegin));
    }
}

class SearchInsert02Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int mid = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}