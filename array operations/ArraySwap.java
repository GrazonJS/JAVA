import java.util.*;
public class ArraySwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;
        System.out.println("enter the size of array");
        int s = sc.nextInt();
        int[][] arr= new int[s][s];
        System.out.println("enter the elements of array");
        for(int i=0;i<s;i++ ){
            for(int j=0;j<s;j++){
                arr[i][j]=sc.nextInt();
            }
        } 
        for(int i=0;i<s;i++){
            for(int j=0;j<s;j++){
                if(j==i){
                    temp = arr[i][j];
                    arr[i][j]=arr[i][(s-1)-i];
                    arr[i][(s-1)-i]=temp;
                }
            }
        }
        System.out.println("the swapped array");
        for(int i=0;i<s;i++ ){
            for(int j=0;j<s;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println("");
        } 
    }
}