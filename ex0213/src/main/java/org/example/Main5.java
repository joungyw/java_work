package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Main5 {
    public static void main(String[] args) {
        Supplier<Integer> s = () -> {
            return new Random().nextInt(50);
        };
        System.out.println(s.get());


        List<Integer> list = doList(s,5);
        System.out.println(list);


        List<Integer> list2 = doList(s  = () -> {
            return new Random().nextInt(50);
        }, 7);
        System.out.println(list2);

    }

    private static List<Integer> doList(Supplier<Integer> s, int n) {
        List<Integer> list = new ArrayList<>();
        for (int i =0; i<n; i++){
            int temp = s.get();
            list.add(temp);
        }
        return list;
    }
}
