package org.pcchen.sort;

/**
 * 冒泡排序--双层for循环实现
 * 完成length-1=>0
 * 外层1=>i
 * 外层循环添加一个判断，没有数据交换时，表名排序完成
 *
 * @author ceek
 * @create 2020-12-21 16:38
 **/
public class Sort02_Bubble {
    public static void main(String[] args) {
        int[] x = {1, 3, 2, -1, -11, 2, 3, 1, 3, 9, 5, 4, 8, 2, 2, 3, 11, -2, 24, 21, 33, 44, 24, 5, 7, 7, 7, 6, 5, 6};

        new Sort02_Bubble().bubbleSort(x);
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + "\t");
        }
    }

    public void bubbleSort(int[] x) {
        for (int i = x.length - 1; i > 0; i--) {
            boolean flag = false;   //当存在一次外部循环没有发生数据交换，则说明数据顺序已经完成，返回即可，减少排序次数
            for (int j = 1; j <= i; j++) {
                if (x[j] < x[j - 1]) {
                    flag = true;
                    x[j] = x[j - 1] + x[j];
                    x[j - 1] = x[j] - x[j - 1];
                    x[j] = x[j] - x[j - 1];
                }
            }
            if (!flag) {
                return;
            }
        }
    }
}
