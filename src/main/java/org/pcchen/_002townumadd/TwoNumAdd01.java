package org.pcchen._002townumadd;

/**
 * 两数相加
 * 余数进行翻转比值，相等则正确，否则为溢出
 *
 * @author ceek
 * @create 2020-05-07 8:53
 **/
public class TwoNumAdd01 {
    public static void main(String[] args) {
        long timeBegin = System.currentTimeMillis();
        System.out.println(new TwoNumAdd01Solution().reverse(-2147483640));
        long timeEnd = System.currentTimeMillis();
        System.out.println("执行耗时：" + (timeEnd - timeBegin));
    }
}

/**
 *
 */
class TwoNumAdd01Solution {
    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            //首先获取到位数取余后的翻转累加值
            int tmp = res * 10 + x % 10;
            //将翻转累加值进行恢复翻转，和之前的结果只比较，如果不相等，则表示整数溢出
            if ((tmp - x % 10) / 10 != res) {
                return 0;
            }
            res = tmp;
            x /= 10;
        }
        return res;
    }
}