package org.pcchen._20addBinary;

/**
 * 二进制求和
 *
 * @author ceek
 * @create 2020-10-09 16:22
 **/
public class AddBinary01 {
    public static void main(String[] args) {
        System.out.println("===" + new AddBinary01Solution().addBinary("1111", "1111"));
    }
}

class AddBinary01Solution {
    public String addBinary(String a, String b) {
        //1、获取两个字符串中最长的长度
        int len = a.length() > b.length() ? a.length() : b.length();
        //2、将短的字符串前面拼接0，使之保持与长的字符串长度保持一致
        if (a.length() >= len) {
            while (b.length() != len) {
                b = "0" + b;
            }
        } else {
            while (a.length() != len) {
                a = "0" + a;
            }
        }
        //3、进行进位加和，从后往前逐个字符截取进行整数加和
        //3.1、定义进位变量
        int tmp = 0;
        String result = "";
        for (; len > 0; len--) {
            //3.2、将两个字符串的逐个字符进行截取，并和进位进行加和
            int ai = Integer.parseInt(a.substring(len - 1, len));
            int bi = Integer.parseInt(b.substring(len - 1, len));
            result = (ai + bi + tmp) % 2 + result;
            //3.3、当加和值大于1时，进位标识为1；否则进位标识为0
            if (ai + bi + tmp > 1) {
                tmp = 1;
            } else {
                tmp = 0;
            }
        }
        //4、当字符串累加完成并且进位不为0时，字符串最前面添加1；否则不添加直接输出
        if (len == 0 && tmp >= 1) {
            return "1" + result;
        } else {
            return result;
        }
    }
}
