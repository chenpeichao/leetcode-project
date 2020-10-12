package org.pcchen._20addBinary;

/**
 * 二进制求和
 *
 * @author ceek
 * @create 2020-10-10 16:35
 **/
public class AddBinary02 {
    public static void main(String[] args) {
        System.out.println("===" + new AddBinary02Solution().addBinary("123456", "1111"));
    }
}

class AddBinary02Solution {
    public String addBinary(String a, String b) {
        //会有数值越界风险
        return Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
    }
}