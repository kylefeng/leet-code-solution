/*
 * Enmotech.com Inc.
 * Copyright (c) 2019 All Rights Reserved.
 */

package com.github.kylefeng;

/**
 * 91. 解码方法
 * https://leetcode-cn.com/problems/decode-ways/
 *
 * @author kylefeng
 * @time 2019/11/14 10:14
 */
public class Lc91_decode_ways {

    public static int solution_by_dp(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int n = s.length();
        int[] dp = new int[n];

        // 只有一个字符时，如果是 '0' 那么无解，否则只有一种解
        dp[0] = s.charAt(0) == '0' ? 0 : 1;

        for (int i = 1; i < n; i++) {
            int cur = s.charAt(i) - '0';
            int prev = (s.charAt(i - 1) - '0') * 10 + cur;

            if (cur != 0) {
                dp[i] += dp[i - 1];
            }

            if (prev >= 10 && prev <= 26) {
                dp[i] += i >= 2 ? dp[i - 2] : 1;
            }
        }
        return dp[n - 1];
    }

}
