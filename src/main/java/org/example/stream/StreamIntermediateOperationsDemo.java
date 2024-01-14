package org.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamIntermediateOperationsDemo {

    public static void main(String[] args){
        List<Integer> intList
                = Arrays.asList(12, 54, 63, 12, 7, 98, 63, 54, 72);
        intList.stream().distinct().sorted().forEach(x -> System.out.print(x + ", "));
        System.out.println("\n");
        intList.parallelStream().map( x -> x * x * x).forEach(x -> System.out.print(x + " "));
        System.out.println("\n");

        intList.parallelStream().map( x -> x * x * x).distinct().forEach(x -> System.out.print(x + " "));
        System.out.println("\n");

        intList.parallelStream().map( x -> x * x * x).distinct().sorted().forEach(x -> System.out.print(x + " "));
        System.out.println("\n");

        intList.parallelStream().map( x -> x * x * x).distinct().sorted().filter(x->x<10000).forEach(x -> System.out.print(x + " "));

        System.out.println("\n");

        Stream.iterate(3,
                        (Integer n) -> n * n)
                .limit(10)
                .forEach(System.out::println);

        Stream.generate(Math::random).limit(10).forEach(System.out::println);


    }
}
