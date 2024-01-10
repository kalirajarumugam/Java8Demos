package org.example.lambda;

import java.util.function.Predicate;

public class PredicateDemo2 {


    public static void main(String[] args){

        predicateMethod(5, i -> i>7);
    }

    static void predicateMethod(int number, Predicate<Integer> predicate){

        if(predicate.test(number)){
            System.out.println("Number : " + number);
        }
    }

}
