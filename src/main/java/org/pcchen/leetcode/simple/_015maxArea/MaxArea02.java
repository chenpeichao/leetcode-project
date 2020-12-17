package org.pcchen.leetcode.simple._015maxArea;

/**
 * 盛最多水的容器
 * 双指针写法
 * 模式识别：当需要移动数组两边的指针时，考虑双指针写法
 * 算法为何移动较小的：
 * 假定小的不懂，当移动大的时候，容量可定小于等于不移动，所以移动小的
 *
 * @author ceek
 * @create 2020-05-26 9:36
 **/
public class MaxArea02 {
    public static void main(String[] args) {
        long timeBegin = System.currentTimeMillis();
        System.out.println(new MaxArea02Solution().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        long timeEnd = System.currentTimeMillis();
        System.out.println("执行耗时：" + (timeEnd - timeBegin));
    }
}

class MaxArea02Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int max = 0;
        if (null == height) {
            return max;
        }
        while (left < right) {
            int tmp = height[left] - height[right] > 0 ? height[right] : height[left];
            max = Math.max(max, tmp * (right - left));
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return max;
    }
}
