package org.example.lambda;

import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args){

        Supplier<Double> random = () -> Math.random();

        System.out.println("Supplier : " + random.get());

    }
}
