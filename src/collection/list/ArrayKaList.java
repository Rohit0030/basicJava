package collection.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayKaList {
    public static void main(String[] args) {

        //Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.
        // default size of ArrayList is 10 , we can increase and decrease initialCapacity of arrayList
        ArrayList<String> car = new ArrayList<>(20); // Create an ArrayList object
        car.add("maruti");
        car.add("Honda");    // ArrayList can store only 10 elements
        car.add("Farari");
        car.add("BMW");
        car.add("rohit");
        car.add("mohit");
        car.add("richa");
        car.add("neha");
        car.add("bhawna");
        car.add("twinkle");
        car.add("samyak");
        car.add("saizal");
        car.add("sahima");
        car.add("payal");
        car.add("mahak");
        System.out.println("==========Print All================");
        System.out.println(car);

        System.out.println("==========access the elements===============");
        System.out.println(car.get(0)); //To access an element in the ArrayList, use the get() method and refer to the index number:

        System.out.println("============set the element ==================");
        System.out.println(car.set(1,"Honda City")); //To modify an element, use the set() method and refer to the index number:

        System.out.println("==========remove element=============");
        System.out.println(car.remove(0)); //To remove an element, use the remove() method and refer to the index number:

       // System.out.println("===========clear all elements=============");
        //car.clear(); //To remove all the elements in the ArrayList, use the clear() method:
      //  System.out.println(car);
        System.out.println("==========find size =============");
        System.out.println(car.size()); //To find out how many elements an ArrayList have, use the size method:


        System.out.println("=====Sort the array====== ");
        Collections.sort(car);  // Sort cars
        for (String i : car) {
            System.out.println(i);
        }
    }

}
