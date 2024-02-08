package org.example;

// enum -> 제한 값이 정해짐
// 어노테이션 LOMBOK
// 개변형 매개변수


// static 메서드에서는 static 변수 사용 가능
// heap 메서드이면 heap 영역 변수, static 변수 사용 가능
class Outer{
   private static int num = 0;
    public static class Nested1{
        public void add(int n){Outer.num+=n;}
    }
    public static class Nested2 {
        public int get(){
            int a = 10;
            return num + a;

        }
        public void doPrint(){
            System.out.println(num);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer.Nested1 ns1 = new Outer.Nested1();
        Outer.Nested2 ns2 = new Outer.Nested2();

        ns1.add(100);
        System.out.println(ns2.get());
        ns2.doPrint();

    }
}