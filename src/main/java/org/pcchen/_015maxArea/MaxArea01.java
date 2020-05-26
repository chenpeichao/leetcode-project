package org.pcchen._015maxArea;

/**
 * 盛最多水的容器
 * 暴力法
 *
 * @author ceek
 * @create 2020-05-26 9:25
 **/
public class MaxArea01 {
    public static void main(String[] args) {
        long timeBegin = System.currentTimeMillis();
        System.out.println(new MaxArea01Solution().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        long timeEnd = System.currentTimeMillis();
        System.out.println("执行耗时：" + (timeEnd - timeBegin));
    }
}

class MaxArea01Solution {
    public int maxArea(int[] height) {
        int max = 0;
        if (null == height) {
            return max;
        }
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int tmp = height[i] - height[j] > 0 ? height[j] : height[i];
                max = max > (tmp * (j - i)) ? max : (tmp * (j - i));
            }
        }
        return max;
    }
}