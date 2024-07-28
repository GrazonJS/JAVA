import java.util.*;
public class ListSample {
    public static void main(String[] args) {
     List<Integer> arr = new ArrayList<>();
     arr.add(343);
     arr.add(25);   
     arr.add(396);   
     arr.add(7);   
     arr.add(14);   
     System.out.println(arr);

     arr.remove(1);
     System.out.println(arr);
     arr.sort();
     System.out.println(arr);

    }
}
