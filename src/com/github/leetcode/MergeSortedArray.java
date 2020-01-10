package com.github.leetcode;

import java.util.Arrays;

/**
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 *
 * 说明:
 *
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * 示例:
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * 输出: [1,2,2,3,5,6]
 *
 * @author curry
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 从最后往前存值
        int lastIndex = m + n - 1;
        m--;
        n--;
        while (m >= 0 && n >= 0) {
            // 取两者最大值进行比较
            nums1[lastIndex--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
        }
        // 说明第二个数组还有值没有存放完全
        while (n >= 0) {
            nums1[lastIndex--] = nums2[n--];
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        new MergeSortedArray().merge(new int[] {1, 2, 3, 0, 0, 0}, 3, new int[] {2, 5, 6}, 3);
    }
}
