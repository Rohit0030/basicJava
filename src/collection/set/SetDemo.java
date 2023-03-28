package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set s = new HashSet();
        s.add(100);                 // set is not a index based data structure
        s.add(200);                 // set does not allow to store duplicate elements
        s.add(300);
        s.add(200);                 // Set deos not follow the insertion order
        s.add(null);                // Set can store only one null value
        s.add(null);


        System.out.println(s);


//        Iterator itr = s.iterator();      // iterator used for print one by one in vertically
//        while (itr.hasNext()) {          // .hashNext is point the element from the itr
//            System.out.println(itr.next());  // .Next used for print the next element
        }
    }

