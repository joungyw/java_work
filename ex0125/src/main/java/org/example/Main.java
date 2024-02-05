package org.example;

interface Printable {
    int a =10;
        public void print(String doc);
}
interface CMYKPrintable extends Printable{
    public void  printCMYK(String doc);
    default public void doA(){
        System.out.println("doA 메서드 입니다.");
    }
}
class SPrint implements Printable {
    @Override
    public void print(String doc) {
        System.out.println("S Print 출력합니다.");
        System.out.println(doc);
    }
}
class LPrint implements Printable {
    @Override
    public void print(String doc) {
        System.out.println("L Print 출력합니다.");
        System.out.println(doc);
    }

}



class  PRN909 implements CMYKPrintable {
    @Override
    public void print(String doc) {

    System.out.println("S Print 컬러 출력합니다.");
        System.out.println(doc);
}
    @Override
    public void printCMYK(String doc) {

        System.out.println("L Print 컬러 출력합니다.");
        System.out.println(doc);
    }
}
public class Main {
    public static void main(String[] args) {
        String doc = "REPORT";

        SPrint sp = new SPrint();
        sp.print(doc);
        LPrint lp = new LPrint();
        lp.print(doc);

      Printable pl = (d)->{
           System.out.println("람다");
       };
        pl.print(doc);

        PRN909 prn909 = new PRN909();
        prn909.print("흑백 출력");
        prn909.printCMYK("컬러출력");

    }
}