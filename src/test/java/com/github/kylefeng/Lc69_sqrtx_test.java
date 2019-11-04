package com.github.kylefeng;

import org.junit.jupiter.api.Test;

import static com.github.kylefeng.Lc69_sqrtx.mySqrt;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author kylefeng
 * @time 2019/11/2 22:35
 */
public class Lc69_sqrtx_test {


    @Test
    void testCase() {
        assertEquals(2, mySqrt(4));
        assertEquals(2, mySqrt(8));
    }

}
