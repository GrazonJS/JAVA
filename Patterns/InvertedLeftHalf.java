import java.util.Scanner;
public class InvertedLeftHalf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of rows ");
        int n = sc.nextInt();
        int count=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print("  ");
                //System.out.print(j==(i)?"*":"*_");
            }
            for(int j=count;j>0;j--){
                System.out.print(j==1?"*":"*_");
            }
            count--;
            System.out.print("\n");
         }
    }
}
