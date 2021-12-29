package learn;


import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class main {

    public static void arr(int arrs[]){

        List<Integer> temp = new ArrayList<>();
        for (int i = arrs.length; i > 0 ; i--){
            temp.add(arrs[i-1]);
        }
        temp.stream().forEach(System.out::println);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        arr(arr);
    }
}
