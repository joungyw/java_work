package org.example;

import java.util.Arrays;
import java.util.List;

class Toy {
    private String name;
    private int pice;

    public Toy(String name, int pice) {
        this.name = name;
        this.pice = pice;
    }

    public int getPice() {
        return pice;
    }
}

public class Main6 {
    public static void main(String[] args) {
        List<Toy> list = Arrays.asList(new Toy("로봇", 3000),
                new Toy("총", 5000),
                new Toy("인형", 10000));
        int sum = list.stream().filter(toy -> toy.getPice() < 10000)
                .mapToInt(value -> value.getPice())
                .sum();
        System.out.println(sum);

        sum = list.stream().filter(toy -> toy.getPice()<10000)
                .mapToInt(value -> value.getPice())
                .reduce(0,((left, right) -> left+right));
        System.out.println(sum);
    }
}
