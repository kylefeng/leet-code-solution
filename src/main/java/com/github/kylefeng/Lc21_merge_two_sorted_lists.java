package com.github.kylefeng;

import static com.github.kylefeng.Helper.ListNode;

/**
 * 21. 合并两个有序链表
 *
 * @author kylefeng
 * @time 2019/11/4 22:35
 */
public class Lc21_merge_two_sorted_lists {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }

        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        ListNode prehead = new ListNode(-1);

        ListNode prev = prehead;
        while (l1 != null && l2 != null) {

            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }

            prev = prev.next;
        }

        prev.next = l1 == null ? l2 : l1;
        return prehead.next;
    }

    public static ListNode mergeTwoListsRecur(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }

        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        if (l1.val < l2.val) {
            l1.next = mergeTwoListsRecur(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoListsRecur(l1, l2.next);
            return l2;
        }
    }
}
