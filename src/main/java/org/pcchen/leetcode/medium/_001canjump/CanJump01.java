package org.pcchen.leetcode.medium._001canjump;

import java.lang.reflect.Field;

/**
 * 是否能跳出数组
 *
 * @author ceek
 * @create 2021-01-22 16:24
 **/
public class CanJump01 {
    public static void main(String[] args) throws Exception {
        int a[] = new int[]{3, 2, 1, 0, 4};
        System.out.println(new CanJump01Solution().canJump(a));
    }
}


class CanJump01Solution {
    public boolean canJump(int[] nums) {
        int maxIndex = 0;
        for (int j = 0; j < nums.length; j++) {
            if (j > maxIndex) {
                break;
            }
            for (int i = j; i < nums.length; ) {
                if ((nums[i] + i) >= maxIndex) {
                    maxIndex = i + nums[i];
                    i = maxIndex;
                    if (i >= nums.length - 1) {
                        return true;
                    }
                    if (nums[i] == 0) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }

        return false;
    }
}