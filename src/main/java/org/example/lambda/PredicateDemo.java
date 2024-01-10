package org.example.lambda;

import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args){

        Predicate<Integer> lessThan20  = i -> i < 20;

        Predicate<Integer> greaterThan10 = i -> i > 10;

        boolean result = greaterThan10.and(lessThan20).test(21);

        System.out.println(result);

        boolean result2 = greaterThan10.and(lessThan20).negate().test(15);

        System.out.println(result2);

    }

}
