package chap03;

class OperatorEx10 {
	public static void main(String args[]) { 
		int a = 1000000;

		// 1000000 * 1000000 / 1000000
		int result2 = a / a * a;   // 1000000 / 1000000 * 1000000

		int c = a * a / a;
		
		System.out.printf("%d * %d / %d = %d%n", a, a, a, c); 
		System.out.printf("%d / %d * %d = %d%n", a, a, a, result2); 	
	}
}
