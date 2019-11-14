package com.github.kylefeng;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.github.kylefeng.Lc32_longest_valid_parentheses.solution_optimized_stack;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author kylefeng
 * @time 2019/11/13 17:08
 */
public class Lc32_longest_valid_parentheses_test {


    @Test
    @DisplayName("Solution by optimized stack iteration.")
    void testSolution1() {
        assertEquals(2, solution_optimized_stack("(()"));
        assertEquals(6, solution_optimized_stack("(()()))"));
    }
}
