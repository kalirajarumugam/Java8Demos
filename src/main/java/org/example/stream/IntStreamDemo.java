package org.example.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamDemo {

    public static void main(String[] args){

        IntStream stream = IntStream.range(1, 100);
        IntStream stream1 = IntStream.range(1, 100);

        stream.filter(x -> x % 4 == 0).forEach(System.out::println);

        long count = stream1.filter(x -> x % 4 == 0).count();

        System.out.println("Count : " + count);

        System.out.println("Stream : " + stream);

    }
}
