package my;

import java.util.Scanner;

public class EX {
	public static void main(String[] args) {

		DB db = new DB();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
		System.out.println("1. 할일 입력");
		System.out.println("2. 할일 목록");
		System.out.println("3. 종료");
		System.out.println("번호를 입력하세요");
		
		String input = scan.nextLine();

		if (input.equals("1")) {
			db.insert(input);
			String todo = scan.nextLine();
			db.insert(todo);
		} 
		
		else if (input.equals("2")){
			db.select();
		}
		
		else {
			System.out.println("종료 합니다.");
		}
		
	}
}
}