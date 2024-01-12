package ch04;

import java.util.*;

class FlowEx07 {
	public static void main(String[] args) { 
		int user, com;


		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		user = Integer.parseInt(tmp); 

		com = (int)(Math.random() * 3) + 1; 
		System.out.println(com);
		System.out.println(user);
		
		switch(user-com) {
			case 2: case -1:
				System.out.println("user-com의 값이 2이거나 -1입니다.");
				break;
			case 1: case -2:
				System.out.println("user-com의 값이 1이거나 -2입니다.");
				break;
			case 0:
				System.out.println("user-com의 값이 0입니다.");
				break;
				default:
					System.out.println("이쪽으로 옵니다.");
		}
	}
}
