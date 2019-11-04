package com.github.kylefeng;

/**
 * 69. x 的平方根
 *
 * @author kylefeng
 * @time 2019/11/2 22:33
 */
public class Lc69_sqrtx {

    public static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int left = 1;
        int right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid * mid > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }

}
