package ex10;
// 생략되어진 표현
//import java.lang.*;
//기본생성자

public class Ex06 {
	
	// 생성자 매서드
	// 생성자는 리턴되는 값이 안적혀있다.
	// 매서드는 리턴되는 값이 적혀져 있다.
	
	//클래스 함수는 인스턴스화 해야지만 사용할 수 있다. 
	public void doA() {
		System.out.println("doA 매서드 입니다.");
	}
	//static 은 메모리 공간에 항상 상주 한다.
	public static void doB() {
		System.out.println("doB 매서드 입니다.");
	}
	
	Ex06(){//생성자
		System.out.println("기본 생성자");
	//	alt + shift + s -> c 기본생성자 만들기
	}
	
	public static void main(String[] args) {	
		Ex06 ex06 = new Ex06();
		ex06.doA();
		
		Ex06.doB();
		
		System.out.println();
		
		
	}
}
