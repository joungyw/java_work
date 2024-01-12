package ex06;

import java.util.Scanner;

class Main {
	public static int solution(int num, int n) {
			if(2 <= num && num <= 100 && 2 <= n && n <= 9) 
			else if(num%n == 0)
				result = 1;
			else if(num%n !=0)
				 result = 0;
				
		}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int n = scan.nextInt();

		int result = solution(num, n);
		

	}
}
