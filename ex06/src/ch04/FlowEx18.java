package ch04;

class FlowEx18 {
	public static void main(String[] args) {
		
		// i = 2일때 J = 1~ 9
		// i = 3일때 J = 1~ 9
		// i = 4일때 J = 1~ 9
		// i = 9일때 J = 1~ 9
	
		
		for (int i = 2; i <= 9; i++) {
			
			for (int j = 1; j <= 9; j++) {
				
				
				System.out.println(i +" * "+ j +" = " + i*j);
			}
		}
	}
}
