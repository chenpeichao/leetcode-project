package org.pcchen._019containsDuplicate;

import java.util.HashMap;
import java.util.Map;

/**
 * 整形数组中有重复元素-map
 *
 * @author ceek
 * @create 2020-09-18 16:39
 **/
public class ContainsDuplicate02 {
    public static void main(String[] args) {
        System.out.println("===" + new SolutionContainsDuplicate02().containsDuplicate(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 1}));
    }
}

class SolutionContainsDuplicate02 {
    public boolean containsDuplicate(int[] nums) {
        // if(null == nums) {
        //     return true;
        // }
        Map<Integer, Integer> resultMap = new HashMap<Integer, Integer>();
        for (int i : nums) {
            if (null != resultMap.get(i)) {
                return true;
            } else {
                resultMap.put(i, i);
            }
        }
        return false;
    }
}