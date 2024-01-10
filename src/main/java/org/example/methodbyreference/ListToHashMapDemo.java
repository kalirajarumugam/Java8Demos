package org.example.methodbyreference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToHashMapDemo {

    public static void main(String[] args){

        // creating arraylist to add elements
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Guava");
        fruits.add("Pineapple");
        fruits.add("Apple");

        // printing contents of arraylist before conversion
        System.out.println("Elements in ArrayList are : " + fruits);

        Map<String, Integer> map = fruits.stream().collect(Collectors.toMap(Function.identity(), String::length, (e1, e2)->e1, HashMap::new));

        System.out.println("Elements in ArrayList are : " + map);

    }

}
