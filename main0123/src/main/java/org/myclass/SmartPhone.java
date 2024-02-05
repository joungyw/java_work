package org.myclass;

class SmartPhone extends MobilPhone {
    private  String androidVer;
    public SmartPhone(String number, String ver) {
        super(number);
        this.androidVer = ver;
    }
    public void playApp(){
        System.out.println("앱 실행함 안드로이드 버전은 = "+androidVer);

    }
}
