package org.pcchen.leetcode.simple._012addTwoNumbers;

/**
 * 链表-两数相加
 *
 * @author ceek
 * @create 2020-05-20 11:32
 **/
public class AddTwoNumbers02 {
    public static void main(String[] args) {
        long timeBegin = System.currentTimeMillis();
        ListNode listNode1 = new ListNode(8);
        listNode1.next = new ListNode(1);
        listNode1.next.next = new ListNode(2);
        ListNode listNode2 = new ListNode(2);
        listNode2.next = new ListNode(8);
        listNode2.next.next = new ListNode(9);
        listNode2.next.next.next = new ListNode(9);
        listNode2.next.next.next.next = new ListNode(9);

        ListNode listNode = new AddTwoNumbers02Solution().addTwoNumbers(listNode1, listNode2);
        System.out.println(listNode);
        long timeEnd = System.currentTimeMillis();
        System.out.println("执行耗时：" + (timeEnd - timeBegin));
    }
}

class AddTwoNumbers02Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;

        int carry = 0;
        while (null != l1 || null != l2) {
            int numL1 = null == l1 ? 0 : l1.val;
            int numL2 = null == l2 ? 0 : l2.val;

            int sum = numL1 + numL2 + carry;
            carry = sum / 10;
            sum = sum % 10;

            if (null != l1) {
                l1 = l1.next;
            }
            if (null != l2) {
                l2 = l2.next;
            }

            current.next = new ListNode(sum);
            current = current.next;
        }

        if (carry > 0) {
            current.next = new ListNode(1);
        }
        return dummyHead.next;
    }
}