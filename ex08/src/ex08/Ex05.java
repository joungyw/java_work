package ex08;

public class Ex05 {
	public static void main(String[] args) {

		aa: for (int k = 0; k < 10; k++)
			
			for (int i = 0; i < 10; i++) {
				System.out.println("i = " + i);

				for (int j = 0; j < 10; j++) {
					if (j == 3 || j == 6 || j == 9) {
						continue;
					}
					
					if (j == 7) {
						i = i + 1;
						System.out.println("여기 왔냐");
						break aa;
					}
					System.out.println("\t j= " + j);
				}
			}
	}
}
