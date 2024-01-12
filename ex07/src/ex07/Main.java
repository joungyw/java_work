package ex07;

import java.util.*;

interface Main {
	static void main(String[] arge) {
		Scanner scan = new Scanner(System.in);

		int h = scan.nextInt();
		int m = scan.nextInt();
		int mm = scan.nextInt();

		h += mm / 60;
		m += mm % 60;

		if (m >= 60) {
			h += 1;
			m -= 60;
		}
		if (h >= 24) {
			h -= 24;
		}
		System.out.println(h + " " + m);
	}
}
