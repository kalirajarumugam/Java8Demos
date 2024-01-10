package org.example.lambda;

import java.util.function.Predicate;

public class PredicateDemo3 {

    public static void main(String[] args){

        Predicate<String> hasLength10 = str -> str.length() > 10;

        Predicate<String> containsA = str -> str.contains("A") || str.contains("a");

        System.out.println("Result *** " + hasLength10.and(containsA).test("KlirjTheGret"));

    }

}
