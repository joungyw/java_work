package ch04;

import java.util.*;

class FlowEx11 {
	public static void main(String[] args) {
		char gender = 0;
		String regNo = "";
//		System.out.println(gender);
//		System.out.println(regNo);

		Scanner scanner = new Scanner(System.in);
		regNo = scanner.nextLine();

		gender = regNo.charAt(7); // �Է¹��� ��ȣ�� 8��° ���ڸ� gender�� ����

		switch (gender) {
		
		case '1';
		case '3';
		switch(gender) {		
		case '1':
			System.out.println("2000년 이전에 태어난 남자입니다.");
			break;
		case '3':
			System.out.println("2000년 이후에 태어난 남자입니다.");
		}
			break;			
		case '2':
		case '4';
		switch(gender) {
			
		case '2':
			System.out.println("2000년 이전에 태어난 여자입니다.");
			break;
		case '4':
			System.out.println("2000년 이후에 태어난 여자입니다.");
			break;
		default:
			System.out.println("아닐떄 여기로 옵니다.");

		}
	}
}
