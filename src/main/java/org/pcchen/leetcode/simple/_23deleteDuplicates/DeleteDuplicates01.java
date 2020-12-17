package org.pcchen.leetcode.simple._23deleteDuplicates;

import java.io.*;

/**
 * 删除排序链表中的重复元素
 *
 * @author ceek
 * @create 2020-10-20 16:58
 **/
public class DeleteDuplicates01 {
    public static void main(String[] args) {

    }
}

class DeleteDuplicates01Solution {
    public static void copy(ListNode1 source, ListNode1 target) {

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(bos);
            oos.writeObject(source);
            oos.flush();
            oos.close();
            bos.close();
            byte[] byteData = bos.toByteArray();

            ByteArrayInputStream bais = new ByteArrayInputStream(byteData);
            target = (ListNode1) new ObjectInputStream(bais).readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public ListNode1 deleteDuplicates(ListNode1 head) {
//        ListNode next = head.next;
//        if(null != next && next.val == head.val) {
//            copy(head, head.next);
//            deleteDuplicates(head);
//        } else if(null != next && next.val == head.val && null == next.next) {
//            next = null;
//        }
//        return head;
        if (head == null || head.next == null) {
            return head;
        }
        head.next = deleteDuplicates(head.next);
        if (head.val == head.next.val) head = head.next;
        return head;
    }
}

class ListNode1 {
    int val;
    ListNode1 next;

    ListNode1(int x) {
        val = x;
    }
}


/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */