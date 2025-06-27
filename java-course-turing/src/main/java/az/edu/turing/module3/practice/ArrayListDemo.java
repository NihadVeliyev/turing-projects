package az.edu.turing.module3.practice;
import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");      // add to end
        fruits.add("Banana");
        fruits.add(1, "Cherry");  // insert at index 1

        fruits.set(0, "Apricot"); // replace element at index 0
        fruits.remove(2);         // removes "Banana"

        System.out.println(fruits); // [Apricot, Cherry]
    }
}
