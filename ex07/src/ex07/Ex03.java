package ex07;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		for (int i = 0;; i++) {
			String temp = scan.nextLine();
			
		if(temp.equals("0 0"))
		{
			break;
		}

			int num1 = Integer.parseInt(temp.split(" ")[0]);
			int num2 = Integer.parseInt(temp.split(" ")[1])
					;
			
			System.out.println(num1+num2);
			

		}

	}

}
