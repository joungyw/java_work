package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Box<String> box = new Box<>();

        box.setObj("String 넣었어");
        System.out.println(box);


 //       List<Box<String>> list = new ArrayList<>();{
 //       for (int i = 0; i < 10; i++)
 //           Box<String> box1 = new Box<>();
 //       box.setObj("String 넣었어");
 //       list.add(box);
//    }
//
//
//      list.get(0).setObj("바뀜");
//
//        System.out.println(list);

    }
}