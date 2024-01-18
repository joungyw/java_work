package ex10;

public class Ex08 {
	
	public static void main(String[] args) {
		TV t1 = new TV();
		TV t2 = t1;
		
		System.out.println(t1.channel);
		System.out.println(t1.power);
		
		System.out.println(t2.channel);
		System.out.println(t2.power);
		
		// F3 누르면 이동
		//
		t1.channel ++;
		t1.power();
		System.out.println();
		
		System.out.println(t1.channel);
		System.out.println(t1.power);
		
		System.out.println(t2.channel);
		System.out.println(t2.power);
		
	}

}
