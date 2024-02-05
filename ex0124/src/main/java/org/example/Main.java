package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

      /*Friend[] f = new Friend[5];

       f[0] = new UniFriend("hongildong", "computer","01012345678");
       f[1] = new CompFriend("compdildong", "aa", "01098765432");

        System.out.println(f[0]);
        System.out.println(f[1]);
*/
        List<Friend> list = new ArrayList<>();
        list.add(new UniFriend("hongildong", "computer","01012345678"));
        list.add(new CompFriend("compdildong", "aa", "01098765432"));

        System.out.println(list);


    }
}