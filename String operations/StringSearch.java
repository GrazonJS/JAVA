import java.util.Scanner;

public class StringSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        System.out.println("enter the value to find");
        String str1 = sc.nextLine();
        if(str.contains(str1)){
            System.out.println(str.indexOf(str1));
        }
    }
}