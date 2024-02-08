package org.example;

interface Printable{
    public void print();
}
class Paper {
    private String con;

    public Paper(String con) {
        this.con = con;
    }

    public Printable getPtinter() {

        class Printer implements Printable {
            @Override
            public void print() {
                System.out.println(con);
            }
        }
        return new Printer();
    }

    public Printable getPtinter1() {

       return new Printable() {
           @Override
           public void print() {
               System.out.println(con);
           }
        };
    }
    public Printable getPtinter2(){
        return ()->{
            System.out.println(con);
        };
    }
}
public class Main3 {
    public static void main(String[] args) {
        Paper p = new Paper("행복합니다.");
        Printable printable = p.getPtinter2();
        printable.print();
    }
}
