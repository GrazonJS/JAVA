import java.util.Scanner;

public class KeyGeneration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the string1");
         String str1 = sc.nextLine();
        //  System.out.println("Enter the string2");
        //  String str2 = sc.nextLine();
         for(String s : logic(str1)){
            System.out.println(s);
         }
         
    }
    public static String[] logic(String str){
      //  char[] arr = new char[str.length()];
        String[] arrs = new String[3];
        // for(int i=0;i<str.length();i++){
        //         arr[i] = str.charAt(i);
        // }
        int count=0,len=str.length()/3;
        int quo = str.length()/3, rem = str.length()%3;
         if(str.length()%3==0){
            for (int i=0;i<arrs.length;i++) {
                arrs[i] = str.substring(count, count+len);
                count += len;
            }
            
         }else{
            arrs[0] = str.substring(0,quo);
            arrs[1] = str.substring(quo,str.length()-quo);
            arrs[2] = str.substring(str.length()-quo,str.length() );
         }
         
         return arrs;
    }
}

