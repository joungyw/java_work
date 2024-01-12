package ex08;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		String todolist[] = new String[100];
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			int slesct = scan.nextInt();
		if (slesct == 1) {
			System.out.println("할일 추가 만들어야됨");
			todolist[0] = "공부";
		} else if (slesct == 2) {
			System.out.println("할일 삭제 만들어야됨");
			todolist[0] = "";
		} else if (slesct == 3) {
			System.out.println("우선순위 부여 만들어야됨");
		}else {
			break;
		}
		}
		System.out.println(todolist[0]);
		
	}

}
