package org.myclass;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        List<Member> list = new ArrayList<>();

        Member member1 = new Member("홍길동", 20);
        System.out.println(member1);

        Member member2 = new Member("홍길동", 20);
        System.out.println(member2);

        list.add(member1);
        list.add(member2);

        System.out.println(list);

        System.out.println(list.get(0));



    }
}
