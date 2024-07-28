import java.util.Scanner;

public class HollowTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of rows");
        int n = sc.nextInt(),count=n;
        for (int i =1; i<=n ; i++) {
            for (int j = count-1; j>0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                if(j==i || j==1 || i==n){
                    System.out.print(j==i?"*":"* ");
                }else{
                    System.out.print("  ");
                }
            }
            count--;
            System.out.print("\n");
        }
    }
}
