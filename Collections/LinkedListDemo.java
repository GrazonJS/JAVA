import java.util.LinkedList;
class LinkedListDemo{
    public static void main(String[] args) {
        LinkedList a1 = new LinkedList();
        LinkedList a2 = new LinkedList();
        int val = 232;
        a1.add(val);
        a1.add("val");
        a1.add("num");
        a1.add(new String("hello"));
        for(Object temp:a1){
            System.out.println(temp);
        } 
        a1.remove(2);
        System.out.println(a1);

        a2.add(a1);
        a2.add("h1");
        a2.add(a2);
        System.out.println(a2);
    }
}