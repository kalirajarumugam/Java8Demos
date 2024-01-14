package org.example.stream;

import java.util.*;

public class ParallelStreamDemo {

    public static void main(String[] args){
        List<String> list = Arrays.asList("Hello ", "G", "E", "E", "K", "S!");
        System.out.println("Sequential Stream");
        long startTime = System.nanoTime();
        list.stream().forEach(System.out::print);
        long endTime = System.nanoTime();
        System.out.println("Execution Time Sequential : " + (endTime-startTime));
        System.out.println("\nParallel Stream");
        startTime = System.nanoTime();
        list.parallelStream().forEachOrdered(System.out::print);
        endTime = System.nanoTime();
        System.out.println("Execution Time Parallel 1 : " + (endTime-startTime));
        System.out.println("\nAnother Parallel Stream");
        startTime = System.nanoTime();
        list.stream().parallel().forEachOrdered(System.out::print);
        endTime = System.nanoTime();
        System.out.println("Execution Time Parallel 2 : " + (endTime-startTime));
        startTime = System.nanoTime();
        list.parallelStream().sequential().forEach(System.out::print);
        endTime = System.nanoTime();
        System.out.println("Execution Time Parallel 1 : " + (endTime-startTime));

        Set set = new HashSet();



    }
}
