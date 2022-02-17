package deleteiteminarray;

import java.util.Arrays;

public class Solution {

    public int removeElement(int[] a, int val) {
        int i = a.length - 1;
        int k = a.length;
        while (i >= 0) {
            if (a[i] == val) {
                a[i] = 0;
                for (int j = i; j < k - 1; j++) {
                    a[j] = a[j + 1];
                    a[j + 1] = 0;
                }
                k--;
            }
            i--;
        }
        return k;
    }

    public int removeElementV2(int[] a, int val) {
        int size = a.length;
        int currentIndex = 0;
        for (int i = 0; i < size; i++) {
            if (a[i] != val) {
                a[currentIndex++] = a[i];
            }
        }
        return currentIndex;
    }

    public static void main(String[] args) {

        var nums = new int[]{3, 2, 2, 3};
        var val = 3;
        int k = new Solution().removeElement(nums, val);
        System.out.println(Arrays.toString(nums));
        System.out.println(String.format("New length %s", k));
    }
}
