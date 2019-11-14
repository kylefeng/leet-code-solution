package com.github.kylefeng;

import org.junit.jupiter.api.Test;

import static com.github.kylefeng.Helper.ListNode;
import static com.github.kylefeng.Helper.newLinkedList;
import static com.github.kylefeng.Lc21_merge_two_sorted_lists.mergeTwoLists;
import static com.github.kylefeng.Lc21_merge_two_sorted_lists.mergeTwoListsRecur;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author kylefeng
 * @time 2019/11/4 23:08
 */
public class Lc21_merge_two_sorted_lists_test {

    @Test
    void testCase() {
        ListNode l1 = newLinkedList(1, 2, 4);
        ListNode l2 = newLinkedList(1, 3, 4);
        ListNode merged = mergeTwoLists(l1, l2);
        assertEquals(newLinkedList(1, 1, 2, 3, 4, 4), merged);
    }

    @Test
    void testCaseForRecur() {
        ListNode l1 = newLinkedList(1, 2, 4);
        ListNode l2 = newLinkedList(1, 3, 4);
        ListNode merged = mergeTwoListsRecur(l1, l2);
        assertEquals(newLinkedList(1, 1, 2, 3, 4, 4), merged);
    }
}
