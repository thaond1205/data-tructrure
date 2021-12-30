package learn;

import java.util.Arrays;

public class TwoSum {



    public static void main(String[] args) {
        int[] arr = {2,7,11, 8, 1, 5, 4, 3,15};
        int target = 9;
        for (int i = 0 ; i < arr.length ; i++) {
            int finalI = i;
            Arrays.stream(arr).forEach(p -> {
                if(arr[finalI] + p == target){
                    System.out.println(arr[finalI] + " và " + p);
                }
            });
        }
    }
}
