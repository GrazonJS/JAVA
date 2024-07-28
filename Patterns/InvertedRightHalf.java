import java.util.Scanner;

public class InvertedRightHalf {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of rows ");
        int n = sc.nextInt(),count=n;
        for(int i=1;i<=n;i++){
            for(int j=count;j>0;j--){
                System.out.print(j==(1)?"*":"*_");

            }
            count--;
            System.out.print("\n");
         }
    }
}

