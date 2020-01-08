package com.github.leetcode;

/**
 * 189-旋转数组
 *
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * 示例 1:
 *     输入: [1,2,3,4,5,6,7] 和 k = 3
 *     输出: [5,6,7,1,2,3,4]
 *     解释:
 *     向右旋转 1 步: [7,1,2,3,4,5,6]
 *     向右旋转 2 步: [6,7,1,2,3,4,5]
 *     向右旋转 3 步: [5,6,7,1,2,3,4]
 *
 * 示例 2:
 *     输入: [-1,-100,3,99] 和 k = 2
 *     输出: [3,99,-1,-100]
 *     解释:
 *     向右旋转 1 步: [99,-1,-100,3]
 *     向右旋转 2 步: [3,99,-1,-100]
 *
 * @author curry
 */
public class RotateArray {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        int[] results = new int[length];
        int index = 0;

        k = k > length ? k % length : k;

        // 取最后面的几位
        for (int i = length - k; i < length; i++) {
            results[index++] = nums[i];
        }

        // 取前面的几位
        for (int i = 0; i < length - k; i++) {
            results[index++] = nums[i];
        }

        for (int i = 0; i < results.length; i++) {
            nums[i] = results[i];
        }
    }
}
