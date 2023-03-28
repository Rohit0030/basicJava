package collection.list;

import java.util.Vector;

public class VactorDemo {
    public static void main(String[] args) {
        // vector is an index based data structure
        //vector can store different data-type or heterogeneous data-type
        // we can store duplicate elements
        // we can store multiple null values
        // vector follow the insertion order
        // vector does not follow the  sorting order
        // vector are synchronized collection
        // NOTE: All legacy classes are synchronized
        Vector set=new Vector<>();
        set.add("Rohit");
        set.add(100);
        set.add("Neha");
        set.add("Bhawna");
        System.out.println(set);

    }
}
