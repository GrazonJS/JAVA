import java.util.Scanner;

public class Pascals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of stars");
        int n = sc.nextInt(),count=n,k=1;
        for(int i=1;i<=n;i++){
            
            for(int j=count;j>0;j--){
               
                System.out.print(" ");
                
            }
            for(int j=0;j<i;j++){
                System.out.print("1 ");
            }
            if(count>0){
                count--;
            }
            System.out.print("\n");
        }
    }
}
