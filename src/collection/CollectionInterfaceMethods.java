package collection;

import java.util.ArrayList;

public class CollectionInterfaceMethods {
    public static void main(String[] args) {

        // Collection interface Methods.......................

        ArrayList al = new ArrayList();
        // add integer method in Collection Interface
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        al.add(500);
        al.size();
        System.out.println(al);
        System.out.println(al.contains(500));      // 500 number is contains True or false
        System.out.println(al.isEmpty());          // find..... array is empty true or false
        System.out.println(al.size());             // size of arraylist
        System.out.println(al.remove(0));     //remove index 0 like( 100 )
        System.out.println("Printing add integer methods : "+al);
        al.clear();                                // clear the ArrayList output will be []


        ArrayList al2 = new ArrayList();
        // add String method in Collection Interface
        al2.add("Rohit");
        al2.add("Richa");
        al2.add("Neha");
        al2.add("Bhawna");
        al2.add("Mummy");
        al2.add(500);

        System.out.println("Printing add String methods : " +al2);
        al.addAll(al2);                              // add both  ArrayList in one OBj
        System.out.println("print both obj array list : "+al);
        System.out.println(al.removeAll(al2));       // remove duplicate value from al


    }
}
