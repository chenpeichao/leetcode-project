package org.pcchen.sort;

/**
 * 快速排序-网上方法
 * <p>
 * 对挖坑填数进行总结
 * 1．i = L; j = R; 将基准数挖出形成第一个坑a[i]。
 * 2．j--由后向前找比它小的数，找到后挖出此数填前一个坑a[i]中。
 * 3．i++由前向后找比它大的数，找到后也挖出此数填到前一个坑a[j]中。
 * 4．再重复执行2，3二步，直到i==j，将基准数填入a[i]中。
 *
 * @author ceek
 * @create 2020-12-17 13:44
 **/
public class Sort01_QuickSort_right {
    public static void main(String[] args) {
//        int[] x = {33,44,24,6,5,6};
        int[] x = {1, 3, 2, -1, -11, 2, 3, 1, 3, 9, 5, 4, 8, 2, 2, 3, 11, 24, 21, 33, 44, 24, 5, 7, 7, 7, 6, 5, 6};
//        int[] x = {1,3,2,-1,-11, 2,3};
        new Sort01_QuickSort_right().quick_sort1(x, 0, x.length - 1);
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + "\t");
        }
    }

    void quick_sort1(int s[], int l, int r) {
        if (l < r) {
            int i = AdjustArray(s, l, r);//先成挖坑填数法调整s[]
            quick_sort1(s, l, i - 1); // 递归调用
            quick_sort1(s, i + 1, r);
        }
    }

    //返回调整后基准数的位置
    int AdjustArray(int s[], int l, int r) {
        int i = l, j = r;
        int x = s[l]; //s[l]即s[i]就是第一个坑
        while (i < j) {
            // 从右向左找小于x的数来填s[i]
            while (i < j && s[j] >= x) {
                j--;
            }
            if (i < j) {
                s[i] = s[j]; //将s[j]填到s[i]中，s[j]就形成了一个新的坑
                i++;
            }

            // 从左向右找大于或等于x的数来填s[j]
            while (i < j && s[i] < x) {
                i++;
            }
            if (i < j) {
                s[j] = s[i]; //将s[i]填到s[j]中，s[i]就形成了一个新的坑
                j--;
            }
        }
        //退出时，i等于j。将x填到这个坑中。
        s[i] = x;

        return i;
    }
}
