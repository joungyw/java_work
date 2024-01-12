package ex03;


import java.util.Scanner;

public class Ex01 {

	
public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		// System.out.println("문자열 입력");
		 String str = scan.next();
	    // System.out.println("반복횟수 입력");
		int n = scan.nextInt();
		
		
		// System.out.println(str.repeat(n));
		
		// repeat 앞에 문자열을 정수 n만큼 곱한 출력값
		
		// if(str.length() >= 1 && str.length() <= 10 && n >= 1 && n <= 5) {
           // for(int i = 0; i < n; i++){
             //   System.out.print(str);
           
		String answer = "";
        for (int i = 1; i <= n; i++) {
            answer += str;
            
        }
        System.out.println(answer);


		
		
		
	   /* for (int i = 0; i< 5 ; i++) {
	    	System.out.println(i);
	    */
	    }
			
		}
		
		

