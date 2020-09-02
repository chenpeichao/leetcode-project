package org.pcchen._017lengthOfLastWord;

/**
 * 最后一个单词的长度
 *
 * @author ceek
 * @create 2020-08-27 16:47
 **/
public class LengthOfLastWord01 {
    public static void main(String[] args) {
        System.out.println("===" + new SolutionLengthOfLastWord01().lengthOfLastWord("       ") + "===");
    }
}

class SolutionLengthOfLastWord01 {
    public int lengthOfLastWord(String s) {
        String[] splits = s.split(" ");
        if (null != splits && splits.length > 0) {
            return splits[splits.length - 1].length();
        }
        return 0;
    }
}