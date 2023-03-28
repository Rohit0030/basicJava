package collection.list;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedKaList {
    public static void main(String[] args) {

        //Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.

        LinkedList<Integer> number=new LinkedList<Integer>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        number.add(50);
        number.add(50);
        number.add(50);
        number.add(50);
        number.add(45);
        number.add(50);
        number.add(50);
        System.out.println("Access the elements from Array: "+number);


        number.addFirst(5);      // Use addFirst() to add the item to the beginning
        System.out.println("AddFirst item to the beginning : "+number);

        number.addLast(60);      // Use addLast() to add the item to the end
        System.out.println("AddLast item to the end: "+number);

        number.removeFirst();  //Remove an item from the beginning of the list.
        System.out.println(number);

        number.removeLast();  //Remove an item from the end of the list
        System.out.println(number);


        System.out.println(number.getFirst()); //Get the item at the beginning of the list


        System.out.println(number.getLast());    //Get the item at the end of the list

        System.out.println(number.size()); // size of linkedlist array


        Collections.sort(number);
        System.out.println();
        for (Integer i : number) {
            System.out.println(i);
        }
    }
}
