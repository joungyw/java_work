package org.example;
// 다형성으로 모든 객체는 부모객체에 담을 수 있다.

class Apple {
    private String name;

    public Apple(String name) {
        this.name = name;

    }

    @Override
    public String toString() {
        return "Apple{" +
                "name = '" +
                name + "'";
    }
}

class Orange {

    private String name;

    public Orange(String name) {
        this.name = name;

    }

    @Override
    public String toString() {
        return "Apple{" +
                "name = '" +
                name + "'";
    }
}

class Box<A> {
    public Box(A obj) {
        this.obj = obj;
    }

    public Box() {
    }

    private A obj;

    public A getObj() {
        return obj;
    }

    public void setObj(A obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "Box{" +
                "obj=" + obj + '}';
    }
}


public class Main {
    public static void main(String[] args) {

        Box<Apple> box1 = new Box();
        box1.setObj(new Apple("사과"));


        Box<Orange> box2 = new Box();
        box2.setObj(new Orange("오렌지"));

        Apple apple = box1.getObj();
        Orange orange = box2.getObj();


        System.out.println(apple);
        System.out.println(orange);


    }
}