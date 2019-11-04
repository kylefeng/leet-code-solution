package com.github.kylefeng;

/**
 * 26. 删除排序数组中的重复项
 *
 * @author kylefeng
 * @time 2019/11/4 18:56
 */
public class Lc26_remove_duplicates_from_sorted_array {

    public static int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        }

        if (nums.length < 2) {
            return nums.length;
        }

        int i = nums.length > 0 ? 1 : 0;

        for (int n : nums) {
            if (n > nums[i - 1]) {
                nums[i++] = n;
            }
        }

        return i;
    }
}
