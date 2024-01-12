package ch04;

class FlowEx31 {

	public static void main(String[] args) {
//		for (int i = 0; i <= 10; i++) {

		// if (i % 3 == 0)
		// System.out.println(i + "일떄 continue 됨");
		// continue;
//		System.out.println(i);

		for (int i = 0; i <= 100; i++) {
			if (i % 4 == 0)
				System.out.println(i);
			continue;

		}
	}
}
