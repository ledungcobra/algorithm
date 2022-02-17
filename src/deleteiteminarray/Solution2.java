package deleteiteminarray;

import java.util.Arrays;

public class Solution2 {


    public int removeDuplicates(int[] a) {
        int size = a.length;
        int newSize = size;

        for (int i = size - 1; i > 0; i--) {
            if (a[i] == a[i - 1]) {
                for (int j = i - 1; j < newSize - 1; j++) {
                    a[j] = a[j + 1];
                }
                newSize--;
            }
        }
        return newSize;

    }

    public int removeDuplicatesV2(int[] a) {

        int currentIndex = 0;
        for (int i = 0, length = a.length; i < length; i++) {
            if (a[i] != a[currentIndex]) {
                currentIndex++;
                a[currentIndex] = a[i];
            }
        }
        return currentIndex;

    }

    public static void main(String[] args) {
        var a = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        var length = new Solution2().removeDuplicatesV2(a);
        System.out.println(String.format("new length: %d", length));
        System.out.println(Arrays.toString(a));
    }
}
