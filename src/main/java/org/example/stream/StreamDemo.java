package org.example.stream;

import java.util.ArrayList;
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

        int total = number.stream().reduce(10, (ans, i) -> ans+i);
        int stotal = square.stream().reduce(10, (ans, i) -> ans+i);

        List<Integer> newList = number.stream().reduce(new ArrayList<Integer>(), (a,b) -> { if (b % 2 == 0) a.add(b); return a; }, (a, b)->{a.addAll(b); return a;} );

 /*       List<Integer> even = number.stream().reduce(new ArrayList<Integer>(),
                (a, b) -> {
                    if (b % 2 == 0)
                        a.add(b);
                    return a;
                }, (a,b) -> { a.addAll(b); return a;}
        );*/

        System.out.println("New List : " + newList);


        System.out.println("total : " + total + "  " + stotal);


    }
}
