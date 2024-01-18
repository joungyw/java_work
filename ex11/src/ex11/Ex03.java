package ex11;

import java.util.Arrays;

public class Ex03 {
	
	Ex03() {
		int arr[] = new int[] { 10, 20, 5, 2, 11 };
		
		ArrayU myU = new ArrayU();
		myU.sort(arr);
		myU.print(arr);
	}

	public static void main(String[] args) {
		new Ex03();
	}
}
