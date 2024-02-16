package org.example;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        boolean result = IntStream.of(1,2,3,4,5)
                .allMatch(value -> value%2==0);
        System.out.println(result);

        System.out.println();

        result = IntStream.of(1,2,3,4,5)
                .anyMatch(value -> value%2 ==0);
        System.out.println(result);

        System.out.println();

        result = IntStream.of(1,2,3,4,5)
                .noneMatch(value -> value%2 ==0);
        System.out.println(result);

    }
}