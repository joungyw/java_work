package ex07;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int rowNum = scan.nextInt();
		
		
		for (int i = 0; i<rowNum ; i++) {
			
			//System.out.print("i = "+i);
			for(int J=0; J < i+1 ;J++) {
				System.out.print(" * ");

			}
			System.out.println();
		}
	}
}

