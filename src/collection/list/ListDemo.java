package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(50);                  // List is a Index based data structure
        l.add(60);                  // List follow the insertion order
        l.add(10);
        l.add(20);                  // List can store duplicate elements
        l.add(20);
        l.add(null);                // List can store any number of null value
        l.add(null);
        System.out.println(l);



        // iterator get the element from the list one by one
//       Iterator itr=l.iterator();      // iterator used for print one by one in vertically
//        while (itr.hasNext()){          // .hashNext is point the element from the itr
//            System.out.println(itr.next());  // .Next used for print the next element


        }

    }

