package org.pcchen._016maxArraySum;

/**
 * 获取数组最大子序和
 *
 * @author ceek
 * @create 2020-08-20 16:46
 **/
public class MaxArraySum01 {
    public static void main(String[] args) {
        int[] num = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(new MaxArraySum01Solution().maxSubArray(num));
    }
}

class MaxArraySum01Solution {
    public int maxSubArray(int[] nums) {
        if (null != nums && nums.length == 1) {
            return nums[0];
        }
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            max = max > nums[i] ? max : nums[i];
            int tmp = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                tmp = tmp + nums[j];
                max = max > tmp ? max : tmp;
            }
        }
        return max;
    }
}