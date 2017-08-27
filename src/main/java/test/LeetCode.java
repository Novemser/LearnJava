package test;

/**
 * Project: LearnJava
 * Package: test
 * Author:  Novemser
 * 2017/5/25
 */
public class LeetCode {
    public static void main(String[] args) {
        int[] input = new int[]{5, 7, 7, 8, 8, 10};
        new LeetCode().searchRange(input, 8);
    }

    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = res[1] = -1;

        if (nums == null || nums.length == 0) return res;

        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            int mid = (i + j) >> 1;
            if (nums[mid] < target) i = mid + 1;
            else j = mid;
        }

        if (nums[j] != target) return res;
        res[0] = j;

        j = nums.length - 1;
        while (i < j) {
            int mid = (i + j) / 2 + 1;// (i + j) >> 1 + 1 md位移运算的优先级低于加法运算的优先级
            if (nums[mid] > target) j = mid - 1;
            else i = mid;
        }
        res[1] = i;
        return res;
    }
}
