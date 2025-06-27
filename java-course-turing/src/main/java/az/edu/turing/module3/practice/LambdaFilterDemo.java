package az.edu.turing.module3.practice;


import java.util.*;
import java.util.function.Predicate;

public class LambdaFilterDemo {
    public static void filter(List<String> items, Predicate<String> condition) {
        for (String item : items) {
            if (condition.test(item)) {
                System.out.println(item);
            }
        }
    }

    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "kiwi", "pear");


        filter(fruits, s -> s.length() > 4);   // apple, banana


        filter(fruits, s -> s.startsWith("b")); // banana
        filter(fruits, s -> s.contains("a"));
        filter(fruits, s -> s.endsWith("i"));
    }
}

