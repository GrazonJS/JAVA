class Demo {
   void show() {
      System.out.println("i am in show method of super class");
   }
}
class Flavor1Demo {

   //  An anonymous class with Demo as base class
    Demo d = new Demo()
   {
    //@Override 
       void show() {
           super.show();
           System.out.println("i am in Flavor1Demo class");
       }
   };
   public static void main(String[] args){
    Flavor1Demo fd = new Flavor1Demo();
      fd.d.show();
   }
}