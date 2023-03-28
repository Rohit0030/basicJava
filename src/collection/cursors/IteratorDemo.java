package collection.cursors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List li = new ArrayList();
        li.add(100);
        li.add(200);
        li.add(300);
        li.add(400);

        // Iterator Methods are 1-- hashNext() 2-- next() 3-- remove()

        Iterator itr= li.iterator();   // iterator used for print one by one in vertically
        while (itr.hasNext()){

            System.out.println(itr.next());
        }
        li.remove(1);       // remove(Index number) remove the element
        System.out.println(li);





    }
}
