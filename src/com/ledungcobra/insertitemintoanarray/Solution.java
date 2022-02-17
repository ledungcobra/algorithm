package com.ledungcobra.insertitemintoanarray;

import java.util.Arrays;
import java.util.Objects;

public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] == 0 && j < n) {
                nums1[i] = nums2[j++];
            }
        }
        var sorted = Arrays.stream(nums1).sorted().toArray();
        for (int i = 0; i < sorted.length; i++) {
            nums1[i] = sorted[i];
        }
        System.out.println(Arrays.toString(nums1));
    }

    public void merge2(int[] ai, int ni, int[] aj, int nj) {
        int i = ni - 1;
        int j = nj - 1;
        int last = ni + nj - 1;
        while (i >= 0 || j >= 0) {
            if (i >= 0 && j >= 0) {
                if (ai[i] >= aj[j]) {
                    ai[last--] = ai[i--];
                } else {
                    ai[last--] = aj[j--];
                }
            } else if (i >= 0) {
                ai[last--] = ai[i--];
            } else {
                ai[last--] = aj[j--];
            }
        }
    }

    public static void main(String[] args) {
        var solution = new Solution();
        var nums1 = new int[]{1, 2, 3, 0, 0, 0};
        var nums2 = new int[]{2, 5, 6};
        solution.merge2(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }
}
