package org.example.stream;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamFilter2Demo {
    public static void filterByIndexUsingAtomic()
    {
        // create a string array
        String[] myArray
                = new String[] { "stream",   "is",  "a",
                "sequence", "of",  "elements",
                "like",     "list" };

        // create a stream on myArray
        Stream<String> myStream = Stream.of(myArray);

        // create an AtomicInteger
        AtomicInteger i = new AtomicInteger(0);

        // increment the i value by 1 everytime
        // if it is even, print the current element
        myStream.filter(x -> i.incrementAndGet() % 2 == 0)
                .forEach(System.out::println);
    }

    public static void main(String[] args)
    {
        // filter by Object index
        filterByIndexUsingAtomic();
        filterByIndexUsingStream();
    }

    public static void filterByIndexUsingStream()
    {
        // create an array of Strings
        String[] myArray
                = new String[] { "stream",   "is",  "a",
                "sequence", "of",  "elements",
                "like",     "list" };

        // create instream on range of integers
        // filter by even integer and map
        // the integer to the Object of myArray
        IntStream.rangeClosed(0, myArray.length - 1)
                .filter(x -> x % 2 == 0)
                .mapToObj(x -> myArray[x])
                .forEach(System.out::println);
    }
}
