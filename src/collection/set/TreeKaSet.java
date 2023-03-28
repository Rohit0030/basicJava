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
        Iterator<Integer> itr=number.descendingIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("======Poll First=====");//It is used to retrieve and remove the lowest(first) element.
        System.out.println(number.pollFirst());

        System.out.println("after pollFirst the treeSet is: "+number);
        System.out.println("======Poll Last=====");//It is used to retrieve and remove the highest(last) element.

        System.out.println(number.pollLast());
        System.out.println("after poll last the tree set is: "+number);

        System.out.println("Reverse Set: "+number.descendingSet());

       //It returns the group of elements that are less than the specified element.
        System.out.println("Head Set(elements that are less than the specified element): "+number.headSet(30));

        //It returns the group of elements that are less than or equal to(if, inclusive is true) the specified element.
        System.out.println("NevigableSet HeadSet(less than or equal to(if, inclusive is true)): "+number.headSet(30,true));

        //It returns a set of elements that lie between the given range which includes fromElement and excludes toElement.
        System.out.println("SortedSet  SubSet: "+number.subSet(10, false, 40, true));

        //It returns a set of elements that are greater than or equal to the specified element.
        System.out.println("TailSet (greaterthan or equal to): "+number.tailSet(30, false));

        System.out.println("It returns the number of elements in this set"+number.size());
    }
}
