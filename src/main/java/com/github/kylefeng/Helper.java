package com.github.kylefeng;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author kylefeng
 * @time 2019/11/4 22:35
 */
public class Helper {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            this.val = x;
        }


        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("(").append(val).append(")").append("=>").append(next);
            return sb.toString();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ListNode listNode = (ListNode) o;
            return val == listNode.val &&
                    Objects.equals(next, listNode.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(val, next);
        }
    }


    public static ListNode newLinkedList(int... nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Nums to be used to init linked list cannot be empty!");
        }

        ListNode head = null;
        ListNode prev = null;
        for (int i = 0; i < nums.length; i++) {
            ListNode node = new ListNode(nums[i]);
            if (prev == null) {
                head = prev = node;
            } else {
                prev.next = node;
                prev = node;
            }

        }
        return head;
    }

    public static List<Integer> linkedListToList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return list;
    }


}
