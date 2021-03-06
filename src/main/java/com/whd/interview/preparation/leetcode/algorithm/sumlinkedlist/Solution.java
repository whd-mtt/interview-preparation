package com.whd.interview.preparation.leetcode.algorithm.sumlinkedlist;
//给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
//
// 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。 
//
// 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。 
//
// 示例： 
//
// 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//输出：7 -> 0 -> 8
//原因：342 + 465 = 807
// 
// Related Topics 链表 数学


//leetcode submit region begin(Prohibit modification and deletion)


import com.whd.interview.preparation.algorithm.linkedlist.base.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {

    /***
     * 获取俩鸟的节点的值
     * @param l1 链表节点
     * @param l2 链表节点
     * @return ListNode
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p = l1, q = l2, curr = head;
        //carry 表示进位数字，两个数相加进位的可能性只有0和1
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) { p = p.next;}
            if (q != null) { q = q.next;}
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return head.next;
    }

    /***
     * 构建一个链表
     * @param a 整数
     * @return ListNode
     */
    private ListNode createListNode(int a) {
        ListNode cur;
        ListNode head = new ListNode(a % 10);
        cur = head.next = new ListNode(a / 10 % 10);
        cur.next = new ListNode(a / 100);
        return head;
    }

    public static void main(String[] args) {
        int a = 243;
        int b = 364;
        Solution solution = new Solution();
        ListNode l1 = solution.createListNode(a);
        ListNode l2 = solution.createListNode(b);
        ListNode listNode = solution.addTwoNumbers(l1, l2);
        int sum = listNode.val + listNode.next.val * 10 + listNode.next.next.val * 100;
        System.out.println(sum);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
