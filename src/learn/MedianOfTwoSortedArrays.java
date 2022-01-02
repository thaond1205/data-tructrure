package learn;

import java.util.ArrayList;
import java.util.List;

public class MedianOfTwoSortedArrays {

    public static void sortedArrays(int[] num1, int[] num2) {
        List<Integer> merge = new ArrayList<>();

        double avg = 0;
        int size = 0;

        if (num1.length > num2.length) {
            size = num1.length;
        } else {
            size = num2.length;
        }
        for (int i = 0; i < size; i++) {
            if (i < num1.length) {
                merge.add(num1[i]);
            }
            if (i < num2.length) {
                merge.add(num2[i]);
            }
        }
        avg = merge.stream().mapToDouble(a -> a).sum() / merge.size();
        System.out.println(avg);
    }

    public static void main(String[] args) {

        int[] num1 = { 1, 2 }, num2 = { 3, 4, 5, 6 };
        sortedArrays(num1, num2);
    }

}
