
public class Ex01 {

	class Solution {
		public static int solution(int a, int b, int c) {
			int answer = 0;
			
			if (a == b && a == c) {
				answer = (a+b+c)*((a*a)+(b*b)+(c*c))*((a*a*a)+(b*b*b)+(c*c*c));
				System.out.println("세개 다 같음");
			}
			else if(a==b ||a==c ||b==c) {
				answer = (a+b+c)*((a*a)+(b*b)+(c*c));
				
				
			}else {
				answer = (a+b+c);
			}
			

			return answer;
		}

		public static void main(String[] args) {

			int resuit = solution(5, 3, 3);

			System.out.println(resuit);

		}

	}

}
