package org.pcchen._016maxArraySum;

import java.util.Arrays;
import java.util.Collections;

/**
 * 整数数组最大子序和--动态规划算法
 *
 * @author ceek
 * @create 2020-08-21 16:45
 **/
public class MaxArraySum02 {
    public static void main(String[] args) {
        int[] num = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4, -9, -20, -3};
        System.out.println(new MaxArraySum02Solution().maxSubArray(num));
    }
}

class MaxArraySum02Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0]; //全局最大值
        int subHe = nums[0];    //前一个子组合的最大值，状态压缩

        int beginIndex = 0;
        int endIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (subHe >= 0) {
                subHe += nums[i];
            } else {
                subHe = nums[i];
            }
            if (subHe > max) {
                max = subHe;
            }
        }
        return max;
    }
}