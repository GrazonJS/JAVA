import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of stars");
        int n = sc.nextInt(),count=n,k=1;
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=count;j>0;j--){
                if(j!=1 && j!=count && i!=0){
                    System.out.print(k + " ");
                    k++;
                }else{
                System.out.print("* ");
                }
            }
            if(count>0){
                count--;
            }
            System.out.print("\n");
        }
    }
}
