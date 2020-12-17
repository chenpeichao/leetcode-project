package org.pcchen.sort;

/**
 * 快速排序-分治法
 *
 * @author ceek
 * @create 2020-12-17 10:01
 **/
public class Sort01_QuickSort_simple {
    public static int times = 0;

    public static void main(String[] args) {
//        int[] x = {1,3,9,5,4,8,2,-1,-11, 2,3,11,24,21,33,44,24,5,7,7,7,6,5,6};
//        int[] x = {33,44,24,6,5,6};
        int[] x = {1, 3, 2, -1, -11, 2, 3, 1, 3, 9, 5, 4, 8, 2, 2, 3, 11, -2, 24, 21, 33, 44, 24, 5, 7, 7, 7, 6, 5, 6};
//        int[] x = {1,3,2,-1,-11, 2,3};
        new Sort01_QuickSort_simple().quickSort(x, 0, x.length - 1);
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + "\t");
        }
        System.out.println();
        System.out.println("x.length=" + x.length);
        System.out.println("cucle_times=" + Sort01_QuickSort_simple.times);
    }

    public void quickSort(int[] x, int left, int right) {
        int l = left, r = right;
        int flag = x[left]; //定义哨兵

        while (left < right) {
            Sort01_QuickSort_simple.times++;
            while (left < right && x[right] > flag) {
                right--;
            }
            if (left < right) {
                x[left] = x[right];
                left++;
            }
            while (left < right && x[left] < flag) {
                left++;
            }
            if (left < right) {
                x[right] = x[left];
                right--;
            }
        }
        x[left] = flag;

        if (l < r) {
            quickSort(x, l, right - 1);
            quickSort(x, right + 1, r);
        }
    }
}