package ex10;

public class Ex04 {
	public static void main(String[] args) {
		
		// 배열은 기본형타입에 배열이면 0으로 초기화
		// 참조형 타입이면 null 값으로 초기화
		// printf()구문
		// %c 문자 출력
		// %s 문자열 출력
		// %f 소수점있는 숫자 출력
		// %10.2f
		// %d 소수점 없는 숫자 출력
		
		TV[] tv = new TV[100];
		// 인스턴스화
		
		for (int i =0; i < tv.length; i++) {
			tv[i] = new TV();
		}
		tv[0] = new TV();
		tv[1] = new TV();
		tv[2] = new TV();
		tv[3] = new TV();
		
		System.out.println(tv[0].channel);
		System.out.println(tv[1].power);
		System.out.println(tv[2].color);
		
		Integer[] a = new Integer[10];
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		String[] c = new String[10];
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		
	}

}
