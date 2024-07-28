import java.util.*;

public class SampleArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"isnf","gasd","ngsf",};//2,10
        ArrayList<String> arrList = new ArrayList<String>();
        // Arrays.sort(arr);
        for (String number : arr) {
            arrList.add(number);
        }
        Collections.sort(arrList);
        String k = "ngsff";
        System.out.println(arrList);
        // Correctly remove elements equal to k using a forward loop
        // for (int i = 0; i < arrList.size(); i++) {
        //     if (arrList.get(i) == k) {
        //         arrList.remove(i);
        //          // Decrement i to recheck this index in the next iteration
        //          i--;
        //     }
        // }
        while (arrList.contains(k)) {
            arrList.remove(arrList.indexOf(k));
        }
        Collections.reverse(arrList);
        System.out.println(arrList);
    }
}