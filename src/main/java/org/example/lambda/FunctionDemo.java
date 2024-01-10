package org.example.lambda;
import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args){

        Function<Integer, Double> half = a -> a/2.0;
        Function<Double, Double> times3 = a -> a * 3.0;

//        half.andThen(times3);

        System.out.println("Test : " + half.andThen(times3).apply(20));

        Function<Double, Double> identityFunction = Function.identity();

        System.out.println("Identity Function : " + identityFunction.apply(150.5));

    }
}
