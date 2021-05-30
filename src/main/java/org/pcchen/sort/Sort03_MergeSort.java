package org.pcchen.sort;

/**
 * 归并排序
 * <p>
 * 两个有序数据进行归并
 *
 * @author ceek
 * @create 2020-12-24 16:47
 **/
public class Sort03_MergeSort {
    public static void main(String[] args) {
        int tmp = 200000;
        int[] a = new int[tmp];
        int[] b = new int[tmp];
        int cycle = 0;
        while (cycle < tmp) {
            a[cycle] = cycle;
            b[cycle] = cycle + 20;
            cycle++;
        }
        int[] c = new int[a.length + b.length];

        long start = System.currentTimeMillis();
        new Sort03_MergeSort().sortTwoArray(a, b, c);
        long end = System.currentTimeMillis();
        System.out.println("共耗时：" + (end - start));
//        for (int i : c) {
//            System.out.print(i + "\t");
//        }
    }

    public void sortTwoArray(int[] left, int[] right, int[] tmp) {
        int i = left.length;
        int j = right.length;

        int tmp_left = 0, tmp_right = 0;
        int k = 0;
        while (tmp_left < i && tmp_right < j) {
            if (left[tmp_left] < right[tmp_right]) {
                tmp[k++] = left[tmp_left++];
            } else {
                tmp[k++] = right[tmp_right++];
            }
        }

        while (tmp_left < i) {
            tmp[k++] = left[tmp_left++];
        }
        while (tmp_right < j) {
            tmp[k++] = right[tmp_right++];
        }
    }
}
