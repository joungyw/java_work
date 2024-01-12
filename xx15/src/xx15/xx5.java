package xx15;

public class xx5 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		boolean c = a>b && b> (b=30);
		System.out.println(c);
		System.out.println(b);
		
		boolean d = a<b || b> (b=30);
		System.out.println(d);
		System.out.println(b);
		
		// && 앞이 참이면 엔드 뒤에 값도 계산 출력함
		
		boolean e = a<b && b> (b=30);
		System.out.println(e);
		System.out.println(b);
		
		
		
	}
	
}
