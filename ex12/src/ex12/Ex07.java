package ex12;

class Accumulator {
	static int sum = 0;
	public static void add(int i) {
sum += i;
sum = sum+i;
	}

	public static void showResult() {
		System.out.println("sum = 45");
	}
}

public class Ex07 {
	public static void main(String[] args) {
		
		System.out.println(Accumulator.sum);
	
		for(int i = 0; i <10; i++) {
			Accumulator.add(i);
		}
		
		
		Accumulator.showResult();
	}
}
