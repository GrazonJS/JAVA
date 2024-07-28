import java.util.Scanner;

public class HourGlass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of stars in first row ");
        int n= sc.nextInt();
        int count =n;
        for(int i=0;i<n-1;i++){
            for(int j=1;j<=i;j++){
                System.out.print("_");
            }
            for(int j=count;j>0;j--){
                System.out.print(j==1?"*":"*-");
            }
            if(count>1){
                count--;
            }
            System.out.print("\n");

        }
        count =1;
        for(int i=n;i>0;i--){
            for(int j=i-1;j>0;j--){
                System.out.print("_");
            }
            for(int j=1;j<=count;j++){
                System.out.print(j==count?"*":"*-");  
            }
            if(count<n){
                count++;
            }
            System.out.print("\n");
        }
    }
}
