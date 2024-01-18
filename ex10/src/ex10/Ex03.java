package ex10;

public class Ex03 {
	// 같은 패키기 내에서는 같은 클래스명이 존재하면 안됨
	public static void main(String[] args) {
		
		
		TV tv1 = new TV();
		TV tv2 = new TV();
		
		tv1.channel = 10;
		System.out.println(tv1.channel);
		System.out.println(tv2.channel);
		
		tv1.channelUp();
		System.out.println(tv1.channel);
		System.out.println(tv2.channel);
		
	}
}
