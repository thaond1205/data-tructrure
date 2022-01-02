package learn;

import java.util.ArrayList;
import java.util.List;

public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {

        int[] num1 = { 1, 2 }, num2 = { 3,4,5,6 };

        double avg = 0;
        double temp = 0;
        List<Integer> merge = new ArrayList<>();
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
        for (Integer e : merge) {
            temp += e;
        }
        avg = temp / merge.size();
        System.out.println(avg);
    }

}
