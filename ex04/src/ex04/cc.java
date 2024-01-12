package ex04;

public class cc {

	public static void main(String[] args) {
			// 형변환, 연산자		
		// int 정수 double 실수
		int a = 10;
		double b = 20.2;
		
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		
		// 실수인 더블에서 인트로 변경할때는 강제 형변환 (int)
		// 정수에서 실수로 변경할떄는 그냥 씀		
		int c = (int) b;
		double d = a;
		
		System.out.println("c = "+ c);
		System.out.println("d = "+ d);
	
		System.out.println(a==b);
		System.out.println(b==c);
		System.out.println(a==d);
	
		// ||은 주어진 출력값 하나라도 참이면 참
		// System.out.println( b==c && (a==b || a==d)); 3개 이상이면 괄호로 정리
		System.out.println(a==b || a==d);

		// &&은 주어진 츌력값이 전부다 참이면 참
		System.out.println(a==b && a==d);
		
	}	
}
