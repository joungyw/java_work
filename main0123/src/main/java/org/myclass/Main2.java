package org.myclass;

public class Main2 {
    public static void main(String[] args) {
     SmartPhone sp = new SmartPhone("010-6321-5902","1.0");
     sp.playApp();
     sp.answer();


     // 부모객채 //자식 객채
     // 자식객채는 부모객채에 담을 수 없다.
     // 부모객채는 자식객채를 참조할 수 있다
     // 다형성이라한다.

     MobilPhone mp = new SmartPhone("010-9999-4646", "2.0");
     mp.answer();


    }
}
