package collection.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityKaQueue {

    //It is used to keep the elements that are processed in the First In First Out (FIFO) manner.
    public static void main(String[] args) {
        PriorityQueue<String> queue=new PriorityQueue<>();
        queue.add("Samyak");
        queue.add("Rohit");
        queue.add("Neha");
        queue.add("Bhawna");// PriorityQueue does not follow insertion order
        queue.add("Random");
        //queue.add(null);  A PriorityQueue does not allow null elements or non-comparable objects
        System.out.println(queue);

        // Methods of PriorityQueue and there --// Description
        System.out.println(queue.offer("Random 2"));  //It is used to insert the specified element into this queue.
        System.out.println("After use offer Method: "+queue);

        System.out.println(queue.remove());//It is used to retrieves and removes the head of this queue.
        System.out.println("After remove:  "+queue);

        System.out.println(queue.poll());//It is used to retrieves and removes the head of this queue, or returns null if this queue is empty.
        System.out.println("After use pool: "+queue);

        System.out.println(queue.element());//It is used to retrieves, but does not remove, the head of this queue.
        System.out.println("After use Element method: "+queue);

        System.out.println(queue.peek());//It is used to retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
        System.out.println("After use Peel method: "+queue);


        // Iterator method
        Iterator<String> itr2=queue.iterator(); // print in vertically
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }


}
