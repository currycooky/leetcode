package com.github.leetcode;

/**
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * <p>
 * 示例：
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 *
 * @author curry
 */
public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode curr = listNode;
        // 只有当两者都不为空的时候才循环
        while (l1 != null && l2 != null) {
            // 取出当前两者的值，然后比较大小
            int a = l1.val, b = l2.val;
            if (a > b) {
                curr.next = new ListNode(b);
                l2 = l2.next;
            } else {
                curr.next = new ListNode(a);
                l1 = l1.next;
            }
            curr = curr.next;
        }
        // 其中一个链表为空，直接将另一个链表剩下的数据插入到结果中
        curr.next = l1 == null ? l2 : l1;
        return listNode.next;
    }

    public void test() {
        ListNode listNode = new ListNode(-9);
        listNode.next = new ListNode(3);

        ListNode listNode1 = new ListNode(5);
        listNode1.next = new ListNode(7);

        ListNode listNode2 = this.mergeTwoLists(listNode, listNode1);

        while (listNode2 != null) {
            System.out.println(listNode2.val);
            listNode2 = listNode2.next;
        }
    }

    public static void main(String[] args) {
        new MergeTwoLists().test();
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
