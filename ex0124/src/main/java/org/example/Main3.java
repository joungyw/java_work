package org.example;

public class Main3 {

    public static void main(String[] args) {

        Print prn = new Print();
        prn.Print();
        Printerble printerble = new Printerble() {
            @Override
            public void Print() {
                System.out.println("인터페이스");
            }
        };
    printerble.Print();


     Printerble lamdal = () -> {

         System.out.println("람다");
     };
     lamdal.Print();

    }

}
