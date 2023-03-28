package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashKaSet {

    public static void main(String[] args) {

        //A list can contain duplicate elements whereas Set contains unique elements only.

        HashSet<Integer> number=new HashSet<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        number.add(5);
        number.add(null);
        number.add(null);
        number.add(6);

        System.out.println(number);

//        Iterator itr= number.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());

            HashSet set=new HashSet(number);
            set.add("rohit");
            set.add("neha");
            set.add("bhawna");
            set.add("twinkle");

            System.out.println(set);



        }
    }

