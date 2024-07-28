import java.util.Scanner;

public class ArrayMid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int s = sc.nextInt(),n = s-1;
        int[][] arr = new int[s][s];
        System.out.println("enter the elements of array");
        for(int i=0;i<s;i++ ){
            for(int j=0;j<s;j++){
                arr[i][j]=sc.nextInt();
            }
        } 
        System.out.println("the final array is");
        for(int i=0;i<s;i++ ){
            for(int j=0;j<s;j++){
                if((i!=0 && j!=0)&&(i!=n && j!=n)){
                    System.out.print(arr[i][j]+ " ");
                }
            }
            System.out.println("");
        } 
    }
}
