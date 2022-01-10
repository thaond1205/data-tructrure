
import java.util.ArrayList;
import java.util.List;

public class MedianOfTwoSortedArrays {
    //Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

    public static void sortedArrays(int[] nums1, int[] nums2) {
        List<Integer> merge = new ArrayList<>();

        double avg = 0;
        int size = 0;

        if (nums1.length > nums2.length) {
            size = nums1.length;
        } else {
            size = nums2.length;
        }
        for (int i = 0; i < size; i++) {
            if (i < nums1.length) {
                merge.add(nums1[i]);
            }
            if (i < nums2.length) {
                merge.add(nums2[i]);
            }
        }
        avg = merge.stream().mapToDouble(a -> a).sum() / merge.size();
        System.out.println(avg);
    }

    public static void main(String[] args) {

        int[] nums1 = { 1, 2 }, nums2 = { 3, 4, 5, 6 };
        sortedArrays(nums1, nums2);
    }

}
