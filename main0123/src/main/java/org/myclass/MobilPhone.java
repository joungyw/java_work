package org.myclass;

class MobilPhone {
    protected String number;
    public MobilPhone(String number) {
        this.number = number;
    }
    public void answer() {
        System.out.println("번호는 " + number);

    }
}

