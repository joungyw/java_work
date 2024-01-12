package ch04;

class FlowEx20 {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 15; j=j+3) {

			//	System.out.printf("[%d,%d]", i, j);
				System.out.print("["+i+","+j+"]");
			}

			System.out.println();
		}
	} 
}
