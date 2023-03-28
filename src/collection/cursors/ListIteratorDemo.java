package collection.cursors;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List lit2 = new ArrayList();
        lit2.add(100);
        lit2.add("Rohit");
        lit2.add("Neha");

        //ListIterator methods are 1-- hasNext() 2-- next() 3-- hasPrevious() 4-- previous() 5-- remove() 6-- set()

        ListIterator li=lit2.listIterator();
        while (li.hasNext()){
            System.out.println(li.next());
        }
        System.out.println("----------------------------");

        while (li.hasPrevious()){

            System.out.println(li.previous());
        }

        System.out.println("--------------------------");
        lit2.remove("Neha");
        System.out.println(lit2);

        System.out.println("---------------------------");
        lit2.set(0,30);
        System.out.println(lit2);


        }

    }

