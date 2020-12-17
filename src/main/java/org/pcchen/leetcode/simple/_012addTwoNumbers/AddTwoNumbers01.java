package org.pcchen.leetcode.simple._012addTwoNumbers;

/**
 * 链表-两数相加
 *
 * @author ceek
 * @create 2020-05-20 8:39
 **/
public class AddTwoNumbers01 {
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

        System.out.println(new AddTwoNumbers01Solution().addTwoNumbers(listNode1, listNode2));
        long timeEnd = System.currentTimeMillis();
        System.out.println("执行耗时：" + (timeEnd - timeBegin));
    }
}

class AddTwoNumbers01Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(1);

        reverse(listNode, l1, l2, false);

        return listNode;
    }

    public void reverse(ListNode result, ListNode l1, ListNode l2, Boolean isThanTen) {
        if (isThanTen) {
            result.val = (l1.val + l2.val + 1) >= 10 ? (l1.val + l2.val + 1 - 10) : l1.val + l2.val + 1;
        } else {
            result.val = (l1.val + l2.val) >= 10 ? (l1.val + l2.val - 10) : l1.val + l2.val;
        }
        if (null != l1.next && null != l2.next) {
            result.next = new ListNode(l1.next.val + l2.next.val);
            reverse(result.next, l1.next, l2.next, isThanTen ? (l1.val + l2.val + 1) >= 10 : (l1.val + l2.val) >= 10);
        } else {
            if (l1.next != null) {
                result.next = l1.next;
            } else if (l2.next != null) {
                result.next = l2.next;
            }
            if (isThanTen) {
                if ((l1.val + l2.val + 1) >= 10) {
                    if (null == result.next) {
                        result.next = new ListNode(1);
                    } else {
                        reverseListNode(result.next);
                    }
                }
            } else {
                if ((l1.val + l2.val) >= 10) {
                    if (null == result.next) {
                        result.next = new ListNode(1);
                    } else {
                        reverseListNode(result.next);
                    }
                }
            }
        }
    }

    public void reverseListNode(ListNode listNode) {
        if (listNode.val + 1 >= 10) {
            listNode.val = 0;
            if (null == listNode.next) {
                listNode.next = new ListNode(1);
            } else {
                reverseListNode(listNode.next);
            }
        } else {
            listNode.val += 1;
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + val + "]");
        return sb.toString();
    }
}