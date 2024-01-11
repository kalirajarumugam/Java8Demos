package org.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args){

        List<Integer> number = Arrays.asList(2, 3, 4, 5);

        System.out.println("Original List : " + number);

        List<Integer> square = number.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println("Square List : " + square);

        List<String> names = Arrays.asList("Reflection", "Collection", "Stream");
        System.out.println("Name List : " + names);

        List<String> result = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());

        System.out.println("Filtered List : " + result);

        int total = number.stream().map(x->x*x).reduce(0, (ans, i) -> ans+i);
        int stotal = square.stream().reduce(0, (ans, i) -> ans+i);

        System.out.println("total : " + total + "  " + stotal);


    }
}
