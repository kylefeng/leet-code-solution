package com.github.kylefeng;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 32. 最长有效括号
 * https://leetcode-cn.com/problems/longest-valid-parentheses/
 *
 * @author kylefeng
 * @time 2019/11/13 17:07
 */
public class Lc32_longest_valid_parentheses {


    public static int solution_optimized_stack(String s) {
        Deque<Integer> stack = new LinkedList<>();
        int max = 0;

        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')' && stack.size() > 1 && s.charAt(stack.peek()) == '(') {
                stack.pop();
                max = Math.max(max, i - stack.peek());
            } else {
                stack.push(i);
            }
        }
        return max;
    }

}
