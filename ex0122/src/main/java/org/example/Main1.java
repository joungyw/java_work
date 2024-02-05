package org.example;

class Man{
    private String name;

    Man(){
        System.out.println("부모 생성자");
    }


    public void yourName(){
        System.out.println("name = "+name);
    }
}

class BusinessMan extends Man{
    private String company;
    private String position;

    BusinessMan() {
        super();
        System.out.println("기본 생성자");
    }
    BusinessMan(String company,String position, String name){
        this();

        System.out.println("다른 생성자");
        this.company = company;
        this.position = position;

    }


    public void yourInfo(){
    System.out.println("company" + company);
        System.out.println("position" + position);
        yourName();
    }

}
public class Main1 {

    public static void main(String[] args) {
        BusinessMan bm1 = new BusinessMan("그린컴퓨터 학원","학생","정영웅");
        bm1.yourInfo();

    }
}
