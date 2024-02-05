package org.example;

interface Upper {
    default String doUpper(String con) {
        return con.toUpperCase();
    }

}

interface Lower {
    default String doUpper(String con) {
        return con.toLowerCase();
    }
}

interface Print {
    void doA(String con);

}

class MyPrint implements Print, Upper {
    @Override
    public void doA(String con) {
        System.out.println(doUpper(con));
    }
}

public class Main3 {
    public static void main(String[] args) {
        MyPrint mp = new MyPrint();
        mp.doA("abcdef");

        System.out.println(mp instanceof Upper);
        //다형성
        //자식객체를 부모 객체에 담을 수 있다.
        //부모객체는 자식객체를 참조 할 수 있다.

        if (mp instanceof Upper) {
            Upper up = mp;
        }
        try {
            Lower lower = (Lower) mp;
            System.out.println("여기는 실행 안됨");
        } catch (ClassCastException cce) {
            System.out.println("형변환예외");
        }

        System.out.println(mp instanceof Lower);
    }

}

