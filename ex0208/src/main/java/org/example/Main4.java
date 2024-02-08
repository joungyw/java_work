package org.example;

interface Calculist<T>{
    void cal(T a,T b);
}
public class Main4 {
    public static void main(String[] args) {
        Calculist<Integer> cal1 = (a, b) -> System.out.println(a+b);
        cal1.cal(10,20);

        Calculist<Double> cal2 = (a, b) -> System.out.println(a + b);
        cal2.cal(10.0, 20d);


        Calculist<String> cal3 = (a, b) -> System.out.println(a + b);
        cal3.cal("10", "20");
    }
}
