package org.pcchen._008removeElement;

import java.lang.reflect.Array;

/**
 * 数组原地移除元素
 * <p>
 * 只要涉及可能存在前一个覆盖后一个，好似都可以用快慢指针来操作
 *
 * @author ceek
 * @create 2020-05-14 9:08
 **/
public class RemoveElement01 {
    public static void main(String[] args) {
        long timeBegin = System.currentTimeMillis();

        int[] nums = new int[]{3, 2, 2, 3, 2};
        System.out.println(new RemoveElement01Solution().removeElement(nums, 2));
        long timeEnd = System.currentTimeMillis();
        System.out.println("执行耗时：" + (timeEnd - timeBegin));
    }
}

/**
 * 使用双指针算法求解
 */
class RemoveElement01Solution {
    public int removeElement(int[] nums, int val) {
        int j = nums.length - 1;
        int i = 0;
        for (; i <= j; ) {
            if (nums[i] == val) {
                nums[i] = nums[j--];
            } else {
                i++;
            }
        }
        return i;
    }
}