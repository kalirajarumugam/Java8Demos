package org.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterDemo {

    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> even = list.stream().reduce(new ArrayList<Integer>(),
                (a, b) -> {
                    if (b % 2 == 0)
                        a.add(b);
                    return a;
                }, (a,b) -> { a.addAll(b); return a;}
            );
        System.out.println("Reduce : " + even);

        List<Integer> filter = list.stream().filter(a -> a % 2 == 1).collect(Collectors.toList());
        System.out.println("Filtered : " + filter);

        List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,7, 12, 20);
        list2.stream().filter(num -> num % 5 == 0).forEach(System.out::print);

        System.out.println("\nStream Of Strings with Starting Upper Case : ");

        Stream<String> stream = Stream.of("Geeks", "fOr", "GEEKSQUIZ", "GeeksforGeeks");
        stream.filter((str -> Character.isUpperCase(str.charAt(0)))).forEach(System.out::println);

        System.out.println("\nStream Of Strings with ending S ");

        Stream<String> anotherStream = Stream.of("Geeks", "fOr", "GEEKSQUIZ", "GeeksforGeeks");

        anotherStream.filter(str -> str.endsWith("s")).forEach(System.out::println);

    }
}
