package org.pcchen.twonumsum;

import java.util.HashMap;
import java.util.Map;

/**
 * 求两数之和---hash
 * 主要思想：让map中key保存目标和遍历的值的差
 *
 * @author ceek
 * @create 2020-05-06 9:43
 **/
public class TwoNumSum02 {
    public static void main(String[] args) {
        long timeBegin = System.currentTimeMillis();
        int[] a = new SolutionTwoNumSum02().twoSum(new int[]{2, 7, 11, 15}, 9);
        long timeEnd = System.currentTimeMillis();
        System.out.println("执行耗时：" + (timeEnd - timeBegin));
        System.out.println(timeBegin);
        System.out.println(a[0] + "," + a[1]);
    }
}

class SolutionTwoNumSum02 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> keyAndResultMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int chazhi = target - nums[i];

            if (keyAndResultMap.containsKey(nums[i])) {
                return new int[]{keyAndResultMap.get(nums[i]), i};
            }

            keyAndResultMap.put(chazhi, i);
        }
        return null;
    }
}