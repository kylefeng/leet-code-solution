package com.github.kylefeng;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.github.kylefeng.Lc189_rotate_array.rotate;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author kylefeng
 * @time 2019/11/4 19:53
 */
public class Lc189_rotate_array_test {
    @Test
    void testCase() {
        int[] input1 = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] expected1 = new int[]{5, 6, 7, 1, 2, 3, 4};
        rotate(input1, 3);
        assertTrue(Arrays.equals(expected1, input1));
    }
}
