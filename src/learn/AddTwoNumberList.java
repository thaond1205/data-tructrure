package learn;

import java.util.Arrays;

public class AddTwoNumberList {

    // cho 2 list số thứ tự ngược lại
    // tính tổng 2 số ngược lại
    // thuật toán:
    // 1. nhập vào 2 list số nguyên dương
    // 2. đảo ngược 2 list số đó
    // 3. gộp lại thành 1 số
    // 4. tính tổng 2 số
    // 5. tách từng số ra ghép thành 1 list
    // 6. đảo ngược kết quả của list sum

    public static void sumTwoListNumber(Integer list1[], Integer list2[]){
        StringBuilder revert1 = new StringBuilder();
        StringBuilder revert2 = new StringBuilder();
        for(int i = list1.length-1 ; i >= 0 ; i--){
            revert1.append(list1[i]);
            revert2.append(list2[i]);
        }
        int sum = Integer.parseInt(revert1.toString()) + Integer.parseInt(revert2.toString());
        var str = Integer.toString(sum);
        Integer[] arrRevert = new Integer[str.length()];
        Integer[] arr = new Integer[str.length()];
        int j = str.length() -1;
        for (int i = 0; i < str.length() ; i++ ){
            arr[i] = str.charAt(i) -'0';
            arrRevert[i] = str.charAt(j)-'0';
            j--;
        }

        System.out.format("list 1 ssss: %s", Arrays.toString(list1));
        System.out.println();
        System.out.format("list 2: %s", Arrays.toString(list2));
        System.out.println();
        System.out.format("resoult: %s", Arrays.toString(arr));
        System.out.println();
        System.out.format("resoult revert: %s", Arrays.toString(arrRevert));
    }

    public static void main(String[] args) {
        Integer[] list1 = { 2,4,3};
        Integer[] list2 = { 5,6,4};
        sumTwoListNumber(list1,list2);
    }
}
