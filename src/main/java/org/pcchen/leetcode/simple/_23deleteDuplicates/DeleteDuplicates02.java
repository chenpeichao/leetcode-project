package org.pcchen.leetcode.simple._23deleteDuplicates;

/**
 * 删除排序链表中的重复元素
 *
 * @author ceek
 * @create 2020-10-26 16:39
 **/
public class DeleteDuplicates02 {
    public static void main(String[] args) {

    }
}

class DeleteDuplicates02Solution {
    public ListNode deleteDuplicates(ListNode head) {
        while (head != null && head.next != null) {
            if (head.next.val == head.val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}