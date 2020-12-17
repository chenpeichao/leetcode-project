package org.pcchen.sort;

/**
 * 采用挖坑填数思想+分治法
 * 快速排序
 *
 * @author ceek
 * @create 2020-12-16 16:38
 **/
public class Sort01_QuickSort {
    public static void main(String[] args) {
//        int[] x = {33,44,24,6,5,6};
        int[] x = {1, 3, 2, -1, -11, 2, 3, 1, 3, 9, 5, 4, 8, 2, 2, 3, 11, 24, 21, 33, 44, 24, 5, 7, 7, 7, 6, 5, 6};
//        int[] x = {1,3,2,-1,-11, 2,3};
        new Sort01_QuickSort().fenzhi(x, 0, x.length - 1);
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + "\t");
        }
    }

    public void fenzhi(int[] data, int left, int right) {
        if (left < right) {
            int index = quickSort(data, left, right);

            fenzhi(data, left, index - 1);
            fenzhi(data, index + 1, right);
        }
    }

    /**
     * 进行一次挖坑排序,返回基准数坐标,返回给分治思想,用于每个模块进行调用
     *
     * @param data
     * @param left
     * @param right
     */
    public int quickSort(int[] data, int left, int right) {
        int flag = data[left];
        while (left < right) {
            //首先从数组最右端向左进行比较,当比基准数小时,填基准数坑(即将数据复制到基准数的坑里)
            while (left < right && data[right] >= flag)
                right--;
            if (left < right) {
                data[left] = data[right];
                left++;
            }

            while (left < right && data[left] <= flag)
                left++;
            if (left < right) {
                data[right] = data[left];
                right--;
            }
        }
        data[right] = flag;
        return right;
    }
}
