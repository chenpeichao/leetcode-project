package org.pcchen.leetcode.simple._019containsDuplicate;

import java.util.HashSet;
import java.util.Set;

/**
 * 整形数组中有重复元素-set
 *
 * @author ceek
 * @create 2020-09-18 16:36
 **/
public class ContainsDuplicate01 {
    public static void main(String[] args) {
        System.out.println("===" + new SolutionContainsDuplicate01().containsDuplicate(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 1}));
    }
}

class SolutionContainsDuplicate01 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> resultSet = new HashSet<Integer>();
        for (int i : nums) {
            if (resultSet.contains(i)) {
                return true;
            } else {
                resultSet.add(i);
            }
        }
        return false;
    }
}