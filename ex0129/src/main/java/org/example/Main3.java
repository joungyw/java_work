package org.example;

class DBox<L, R>{
    private L l;
    private R r;

    public DBox(L l, R r ) {
        this.l = l;
        this.r = r;
    }
    @Override
    public String toString() {
        return "DBox{" +
                "l=" + l +
                ", r=" + r +
                '}';
    }
}
public class Main3 {
    public static void main(String[] args) {
        DBox<String,Integer> dbox = new DBox<>("더블박스", 10);

        System.out.println(dbox);

    }
}
