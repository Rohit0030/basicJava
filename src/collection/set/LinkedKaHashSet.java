package collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedKaHashSet {
    //LinkedHashSet Class Declaration
    //public class LinkedHashSet<E> extends HashSet<E> implements Set<E>, Cloneable, Serializable
    public static void main(String[] args) {
        LinkedHashSet<Integer> number=new LinkedHashSet<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);  //Java LinkedHashSet class contains unique elements only like HashSet.
        number.add(6);  //Java LinkedHashSet class is non-synchronized.
        number.add(7);  // linkedHashSet class maintains insertion order.
        number.add(7);  // LinkedHashSet does not allow to store duplicate value

        System.out.println(number);

        Iterator<Integer> itr= number.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println(number.remove(5));
        System.out.println("After remove the element, the LinkedHashSet is: " +number   );

        for (int i=0; i<=10;i++){
            if (number.contains(i)){

                System.out.println(i+" :was contain in the list");
            }else {
                System.out.println(i+" was not contain in the list");
            }

        }
    }
}
