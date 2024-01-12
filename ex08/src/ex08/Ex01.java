package ex08;

/* length()
 * split()
 * subString()
 * 
 */

public class Ex01 {

	public static void main(String[] args) {

		String answer = " ";

		String a = "aaaa";
		String b = "bbbb";

		char[] ac = a.toCharArray();
		char[] bc = b.toCharArray();

		for (int i = 0; i < ac.length; i++) {
			
			System.out.print(ac[i]);
			
			System.out.print(bc[i]);
			answer = answer + ac[i]+bc[i];
		}
		System.out.println();
		System.out.println("answer = " + answer);

		
//		System.out.println();
//		for (char temp : ac)
//			System.out.print(temp);

	}

}
