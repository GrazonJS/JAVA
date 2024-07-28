import java.util.Scanner;

public class Diamond {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of rows ");
        int n = sc.nextInt(),count=n;
        for(int i=1;i<=n;i++){
            for(int j=count-1;j>0;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j==i?"*":"*_");
            }
            count--;
            System.out.print("\n");
        }
        count=n;
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=count-1;j>0;j--){
                System.out.print(j==1?"*":"*_");
            }
             count--;
            System.out.print("\n");
        }
        
     }
}
