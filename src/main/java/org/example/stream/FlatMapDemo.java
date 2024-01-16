package org.example.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo {

    public static void main(String[] args){

        Map<Integer, List<String>> map = new HashMap<>();

        // Adding elements to the above Map object
        // Custom input entries
        map.put(1, Arrays.asList("1", "2", "3"));
        map.put(2, Arrays.asList("4", "5", "6"));


        List<String> list = map.values().stream().flatMap(x-> x.parallelStream()).collect(Collectors.toList());

        System.out.println("List **** : " + list);

        // Array 1 has uppercase characters
        String[] a = { "A", "B", "C" };

        // Array 2 has lowercase characters
        String[] b = { "i", "J", "K" };

        String[] c = { "D", "E", "F" };

        String[] s = Stream.of(a, b, c).flatMap(x->Stream.of(x)).toArray(String[]::new);

        System.out.println("String Arrays **** : " + Arrays.deepToString(s));


    }
}
