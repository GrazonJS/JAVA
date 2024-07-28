import java.util.*;
public class SampleQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(34); 
        queue.add(54);
        queue.add(27); 
        queue.add(334); 
        queue.add(368);
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        System.out.println(queue.element());


        
    }
}
