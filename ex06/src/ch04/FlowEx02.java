package ch04;

import java.util.Scanner;

class FlowEx02 {
	public static void main(String[] args) {
		int input;

		Scanner scanner = new Scanner(System.in);
		input = Integer.parseInt(scanner.nextLine()); // �Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ

		if (input == 0) {
			System.out.println("0을 입력했네요");
		}

		if (input != 0)
			System.out.println("0말고 다른것을 입력했네요." + input);

	}
}
