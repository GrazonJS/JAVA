import java.util.Scanner;

public class rectangle extends shape1{
    double length;
    double width;

    rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }

    public double getArea(){
        return this.length*this.width;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(".................");
        double length=sc.nextDouble();
        double width =sc.nextDouble();
        rectangle rc=new rectangle(length, width);
        System.out.println(rc.getArea());
        shape1 sp=new shape1();
        System.out.println(sp.getArea());
        System.gc();
        
    }
   
}
