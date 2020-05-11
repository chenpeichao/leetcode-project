package org.pcchen._005romanToInt;

/**
 * 罗马数字转整数---my
 * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
 * <p>
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 *
 * @author ceek
 * @create 2020-05-11 8:48
 **/
public class RomanToInt01 {
    public static void main(String[] args) {
        long timeBegin = System.currentTimeMillis();

        System.out.println(new RomanToInt01Solution().romanToInt("MCMXCIV"));

        long timeEnd = System.currentTimeMillis();
        System.out.println("执行耗时：" + (timeEnd - timeBegin));

    }
}

/**
 * 1、首先对于罗马数字中的每个字符转换为对应的整数，并存放到数组中
 * 2、将第一个整数存放于临时变量
 * 3、判断数组中的当前整数是否大于前面一个整数
 * 4、如果大于前面一个整数，则减去2倍的前面一个的数(由于已经添加过前一个整数，所以要减去2倍)，否则累加当前数据
 */
class RomanToInt01Solution {
    public int romanToInt(String s) {
        int[] sumTmp = new int[s.length()];
        int sum = 0;
        //获取当前罗马数字，并转换为整形数组
        for (int i = 0; i < s.length(); i++) {
            sumTmp[i] = getRomanIntValue(s.charAt(i));
        }

        //定义临时变量；用于存放当前遍历数据的前一个数据
        int tmp = 0;
        for (int i = 0; i < sumTmp.length; i++) {
            if (tmp < sumTmp[i]) {
                sum -= 2 * tmp;
            }
            tmp = sumTmp[i];
            sum += tmp;
        }

        return sum;
    }

    public int getRomanIntValue(char a) {
        switch (a) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}