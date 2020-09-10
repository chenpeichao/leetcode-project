package org.pcchen._018plusOne;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * @author ceek
 * @create 2020-09-02 16:40
 **/
public class PlusOne01 {
    public static void main(String[] args) {
        System.out.println("===" + new SolutionPlusOne01().plusOne(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0}));
    }
}

class SolutionPlusOne01 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = digits[i] + 1;
            //避免当前位整数为9，加1后变为10，进行格式校正
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        //用来容错全为9时的整形数组
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}