package chap03;
class OperatorEx08 {
	public static void main(String args[]) { 
		int a = 1000000;    // 1,000,000   1�鸸 
		int b = 2000000;    // 2,000,000   2�鸸 

		long c = (long)a * b;     // a * b = 2,000,000,000,000 ?

		System.out.println(c);
	}
}
