/*
 * Enmotech.com Inc.
 * Copyright (c) 2019 All Rights Reserved.
 */

package com.github.kylefeng;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.github.kylefeng.Lc91_decode_ways.solution_by_dp;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author kylefeng
 * @time 2019/11/14 10:15
 */
public class Lc91_decode_ways_test {


    @Test
    @DisplayName("Test dp solution")
    void test1() {
        assertEquals(2, solution_by_dp("12"));
        assertEquals(3, solution_by_dp("226"));
    }
}
