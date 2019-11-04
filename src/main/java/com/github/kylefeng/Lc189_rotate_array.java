package com.github.kylefeng;

/**
 * 189. 旋转数组
 *
 * @author kylefeng
 * @time 2019/11/4 19:43
 */
public class Lc189_rotate_array {

    public static void rotate(int[] nums, int k) {
        if (nums == null || nums.length <= 1) {
            return;
        }

        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
