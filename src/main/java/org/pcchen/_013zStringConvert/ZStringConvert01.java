package org.pcchen._013zStringConvert;

import java.util.ArrayList;
import java.util.List;

/**
 * 字符串z型变化输出
 * <p>
 * 将字符串按照指定行数排列，并安装行输出
 * 例：LEETCODEISHIRING：排好的顺序形状为：
 * L   C   I   R
 * E T O E S I I G
 * E   D   H   N
 * 输出字符串为：LCIRETOESIIGEDHN
 * <p>
 * 解法：z型字符输出---使用指定容量(行数)的StringBuilder的list集合，采用flag=-flag进行回溯遍历输出
 *
 * @author ceek
 * @create 2020-05-21 9:34
 **/
public class ZStringConvert01 {
    public static void main(String[] args) {
        long timeBegin = System.currentTimeMillis();
        System.out.println(new ZStringConvert01Solution().convert("LEETCODEISHIRING", 3));
        long timeEnd = System.currentTimeMillis();
        System.out.println("执行耗时：" + (timeEnd - timeBegin));
    }
}

class ZStringConvert01Solution {
    public String convert(String s, int numRows) {
        if (numRows < 2) {
            return s;
        }

        List<StringBuilder> sbList = new ArrayList<StringBuilder>();
        for (int i = 0; i < numRows; i++) {
            sbList.add(new StringBuilder());
        }

        int flag = 0;
        for (char c : s.toCharArray()) {

            sbList.get(Math.abs(flag)).append(c);

            if (flag == numRows - 1 || flag == 0) {
                flag = -flag;
            }
            flag++;
        }
        StringBuffer sbResult = new StringBuffer();
        for (StringBuilder sb : sbList) {
            sbResult.append(sb);
        }
        return sbResult.toString();
    }
}