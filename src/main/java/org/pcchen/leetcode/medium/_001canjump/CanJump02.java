package org.pcchen.leetcode.medium._001canjump;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 跳跃出数组
 * bfs：广度优先算法
 *
 * @author ceek
 * @create 2021-01-28 16:48
 **/
public class CanJump02 {
    public static void main(String[] args) {
        int a[] = new int[]{3, 2, 1, 0, 4};
        System.out.println(new CanJump02Solution().canJump(a));
    }
}

class CanJump02Solution {
    public boolean canJump(int[] nums) {
        Queue<Integer> q = new LinkedList<Integer>();
        boolean[] visited = new boolean[nums.length];
        q.offer(0);
        while (!q.isEmpty()) {
            for (int size = q.size(); size > 0; size--) {
                // idx is current position
                int idx = q.remove();
                // if this condition is true, we can find an answer
                if (idx >= nums.length - 1) return true;
                // i is the next rightmost position we can reach
                for (int i = idx + 1; i < nums.length &&
                        i <= idx + nums[idx]; i++) {
                    if (visited[i]) continue;
                    visited[i] = true;
                    q.offer(i);
                }
            }
        }
        return false;
    }
}