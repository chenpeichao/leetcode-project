package org.pcchen._007removeDuplicatesInArray;

/**
 * 删除排序数组中的重复项---my
 * <p>
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 * <p>
 * 123444
 * 1232444
 *
 * @author ceek
 * @create 2020-05-13 9:00
 **/
public class RemoveDuplicates01 {
    public static void main(String[] args) {
        long timeBegin = System.currentTimeMillis();

        System.out.println(new RemoveDuplicates01Solution().removeDuplicates(new int[]{1, 2, 2, 2}));

        long timeEnd = System.currentTimeMillis();
        System.out.println("执行耗时：" + (timeEnd - timeBegin));

    }
}

/**
 * 使用双指针算法求解
 */
class RemoveDuplicates01Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return 1;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}