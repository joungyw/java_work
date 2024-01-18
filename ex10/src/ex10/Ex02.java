package ex10;



public class Ex02 {
	public static void main(String[] args) {
		TV tv1 = new TV();

		System.out.println(tv1.color);
		System.out.println(tv1.power);
		System.out.println(tv1.channel);

		tv1.power();
		
		System.out.println(tv1.power);
		tv1.channelDown();
		System.out.println(tv1.channel);
		tv1.channelUp();
		System.out.println(tv1.channel);

//	tv1 = null;
	}
}
