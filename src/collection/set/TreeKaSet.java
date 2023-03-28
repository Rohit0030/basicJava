package collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeKaSet {
    public static void main(String[] args) {
        //TreeSet is being implemented using a binary search tree, which is self-balancing just like a Red-Black Tree.

        TreeSet<Integer> number=new TreeSet<>();
        number.add(10);
        number.add(50);
        number.add(30);         //Java TreeSet class automatic maintains ascending order.
        number.add(30);         //Java TreeSet class contains unique elements only like HashSet.
        number.add(20);
        number.add(40);
        number.add(48);
       // number.add(null);     //Java TreeSet class doesn't allow null element.

        // ALL methods of treeSet

        System.out.println("Print all elements: "+number);
        System.out.println("======equal or closest greatest element========");
        System.out.println(number.ceiling(47));//It returns the equal or closest greatest element of the specified element from the set, or null there is no such element.

        System.out.println("============descending order=========");
        Iterator itr=number.descendingIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("======Poll First=====");//It is used to retrieve and remove the lowest(first) element.
        System.out.println(number.pollFirst());
        System.out.println("after pollFirst the treeSet is: "+number);
        System.out.println("======Poll Last=====");//It is used to retrieve and remove the highest(last) element.
        System.out.println(number.pollLast());
        System.out.println("after poll last the tree set is: "+number);





    }
}
