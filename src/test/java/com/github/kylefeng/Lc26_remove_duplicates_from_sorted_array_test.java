package com.github.kylefeng;

import org.junit.jupiter.api.Test;

import static com.github.kylefeng.Lc26_remove_duplicates_from_sorted_array.removeDuplicates;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author kylefeng
 * @time 2019/11/4 18:56
 */
public class Lc26_remove_duplicates_from_sorted_array_test {

    @Test
    void testCase() {
        assertEquals(2, removeDuplicates(new int[]{1, 1, 2}));
        assertEquals(5, removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }
}
