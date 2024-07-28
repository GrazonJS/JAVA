public class New {
    public int add(int a, int b){
        static int n = 13;
        return a+b;
    }

    public static void main (String args[]){
        for (int i = 0; i < args.length; i++) {
             
            System.out.println(n);
            n +=10;
        }
    }
}
