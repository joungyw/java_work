package ex07;

/*
 * 문자열 my_string, overwrite_string과 정수 s가 주어집니다.
 * 문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을
 * 문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
 * 
 * "He11oWor1d"	"lloWorl"	2	"HelloWorld"
	"Program29b8UYP"	"merS123"	7	"ProgrammerS123"
 */
public class Ex01 {

	// charAt() 몇번쨰...
	// toCharArray() 문자로 배열만들어라
	// replace 대체해라
	// split 분할해라
	
	// subString 문자열을 자르는 함수
	// 매개변수 start,end start부터 end까지
	//

	public static String solution(String my_string, String overwrite_string, int s) {
		
		// my_string = He11oWor1d 길이 = 10
		// overwrite_string = lloWorl
		// s = 2
		// temp = Helloworl
		
		String temp = my_string.substring(0, s) + overwrite_string;
		String result = temp + my_string.substring(temp.length());
		

		return result;
//		System.out.println(temp.length());

//		System.out.println();
//		 System.out.println(my_string.length());
//		 System.out.println(my_string.substring(5,8));
//		 System.out.println(my_string.substring(7,10));

//		 System.out.println(my_string);
//		 System.out.println(overwrite_string);
//		 System.out.println(s);

		// return my_string.substring(0, s) + overwrite_string +
		// my_string.substring(temp.length());
	}

	public static void main(String[] args) {
	String result = solution("He11oWor1d", "lloWorl", 2);
	System.out.println(result);
	result = solution("Program29b8UYP", "merS123", 7);
	System.out.println(result);

	}
}