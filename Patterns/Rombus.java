import java.util.Scanner;

public class Rombus {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the no of stars in first row");
         int n = sc.nextInt();
         for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<n;j++){
                System.out.print(j==(n-1)?"*":"*_");
            }
            System.out.print("\n");
         }
    }
}
