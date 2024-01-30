package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	
		Scanner sc = new Scanner(System.in);

		System.out.println("당신의 이름은?");

		String name = sc.nextLine();
		System.out.println(name + "님 반갑습니다.");

		System.out.println("당신의 성별은?");
		String gender = sc.nextLine();
		System.out.println(gender + "이시군요");
		System.out.println("반갑습니다.");

		System.out.println();
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;

		System.out.println("문제를 드리겠습니다.");
		System.out.println("O / X  또는 YES / NO 로 대답해 주세요");
		// Yes: 0 No: 1
		// ----------------------------------------------------
		System.out.println("Q1. 나는 사실  ");
		System.out.println("yes.백엔드보다 프론트엔드가 좋다. ");
		System.out.println("no.백엔드가 잘 맞는다. ");
		String answer = sc.nextLine();
		
		if (answer.equals("O") || answer.equals("o") || answer.equals("YES") || answer.equals("yes")) {
			sum1 = sum1 + 0;
		} else if (answer.equals("X") || answer.equals("x") || answer.equals("NO") || answer.equals("no")) {
			sum1++;
		}

		System.out.println("Q2. 나는 사실 ");
		System.out.println("yes.조원보다 조장이 되고 싶었다. ");
		System.out.println("no. 조원으로 만족한다.");
		answer = sc.nextLine();
		
		if (answer.equals("O") || answer.equals("o") || answer.equals("YES") || answer.equals("yes")) {
			sum1 = sum1 + 0;
		} else if (answer.equals("X") || answer.equals("x") || answer.equals("NO") || answer.equals("no")) {
			sum1++;
		}

		System.out.println("Q3.나는 관종이다.");
		System.out.println("Yes: 그렇다.");
		System.out.println("No: 아니다. ");
		answer = sc.nextLine();
		
		if (answer.equals("O") || answer.equals("o") || answer.equals("YES") || answer.equals("yes")) {
			sum1 = sum1 + 0;
		} else if (answer.equals("X") || answer.equals("x") || answer.equals("NO") || answer.equals("no")) {
			sum1++;
		}
		// Yes 2개 이상 -> E 출력
		
		System.out.println("-----------------------");

		// ---------------------------------------------------

		System.out.println("Q4.선생님이 모르는 걸 알려주실 때 나는");
		System.out.println("Yes: 그러려니 하고 외운다.");
		System.out.println("No: 외우기 전에 원리를 이해하고 싶다. ");
		answer = sc.nextLine();
		
		if (answer.equals("O") || answer.equals("o") || answer.equals("YES") || answer.equals("yes")) {
			sum2 = sum2 + 0;
		} else if (answer.equals("X") || answer.equals("x") || answer.equals("NO") || answer.equals("no")) {
			sum2++;
		}
		System.out.println("Q5.보조 선생님 학원에서 우리 반 감시하라고 보낸 스파이 아니에요?");
		System.out.println("Yes: 뭐 그런 생각까지 해?");
		System.out.println("No: 마음속으로 스파이가 된 자신을 상상해 본다.");
		answer = sc.nextLine();
		
		if (answer.equals("O") || answer.equals("o") || answer.equals("YES") || answer.equals("yes")) {
			sum2 = sum2 + 0;
		} else if (answer.equals("X") || answer.equals("x") || answer.equals("NO") || answer.equals("no")) {
			sum2++;
		}
		System.out.println("Q6.지금부터 아무것도 생각하지 마!");
		System.out.println("Yes: (생각 안 함)");
		System.out.println("No: 생각을 안 하는 게 뭐지? 생각을 안 한다고 생각하는 건 생각을 하는 건가? " + "생각을 하지 않는 건가? 아무 생각도 안 하는 게 가능해? ");
		answer = sc.nextLine();
		
		if (answer.equals("O") || answer.equals("o") || answer.equals("YES") || answer.equals("yes")) {
			sum2 = sum2 + 0;
		} else if (answer.equals("X") || answer.equals("x") || answer.equals("NO") || answer.equals("no")) {
			sum2++;
		}
	
		System.out.println("-----------------------"); //
		// Yes 2개 이상 -> S 출력 System.out.println("-----------------------"); //
//		 ---------------------------------------------------
		System.out.println("Q7.약속 시간에 1시간이나 늦은 친구,");
		System.out.println("Yes: 사과 이전에 늦은 이유가 궁금하다.");
		System.out.println("No: 친구의 진심을 담은 사과에 마음이 풀린다. ");
		answer = sc.nextLine();
		
		if (answer.equals("O") || answer.equals("o") || answer.equals("YES") || answer.equals("yes")) {
			sum3 = sum3 + 0;
		} else if (answer.equals("X") || answer.equals("x") || answer.equals("NO") || answer.equals("no")) {
			sum3++;
		}
		System.out.println("Q8.나는 대화를 할 때");
		System.out.println("Yes: 사람보다 챗지피티와 대화하는 게 편하다.");
		System.out.println("No: 당연히 사람이 더 편하다.");
		answer = sc.nextLine();
		if (answer.equals("O") || answer.equals("o") || answer.equals("YES") || answer.equals("yes")) {
			sum3 = sum3 + 0;
		} else if (answer.equals("X") || answer.equals("x") || answer.equals("NO") || answer.equals("no")) {
			sum3++;
		}
		System.out.println("Q9.더 기분 좋은 칭찬은?");
		System.out.println("Yes: 너 천재임?");
		System.out.println("No: 너 천사임?");
		answer = sc.nextLine();
		if (answer.equals("O") || answer.equals("o") || answer.equals("YES") || answer.equals("yes")) {
			sum3 = sum3 + 0;
		} else if (answer.equals("X") || answer.equals("x") || answer.equals("NO") || answer.equals("no")) {
			sum3++;
		}
		// Yes 2개 이상 -> T 출력

		System.out.println("-----------------------"); //
//		  --------------------------------------------------- // Yes 2개 이상 -> P 출력
		System.out.println("Q10.할 일이 쌓였을 때");
		System.out.println("Yes: 손에 집히는 대로 시작한다. ");
		System.out.println("No: 우선 계획을 세운다. ");
		answer = sc.nextLine();
		if (answer.equals("O") || answer.equals("o") || answer.equals("YES") || answer.equals("yes")) {
			sum4 = sum4 + 0;
		} else if (answer.equals("X") || answer.equals("x") || answer.equals("NO") || answer.equals("no")) {
			sum4++;
		}
		System.out.println("Q11.둘 중 더 나은 상황은?");
		System.out.println("Yes: 아무 일정이 없을 때 ");
		System.out.println("No:  모든 일정이 정해져 있을 때");
		answer = sc.nextLine();
		if (answer.equals("O") || answer.equals("o") || answer.equals("YES") || answer.equals("yes")) {
			sum4 = sum4 + 0;
		} else if (answer.equals("X") || answer.equals("x") || answer.equals("NO") || answer.equals("no")) {
			sum4++;
		}
		System.out.println("Q12.팀플에서 내가 맡고 싶은 일은?");
		System.out.println("Yes: 정리하고 기록하는 일");
		System.out.println("No: 아이디어를 내는 일");
		answer = sc.nextLine();
		if (answer.equals("O") || answer.equals("o") || answer.equals("YES") || answer.equals("yes")) {
			sum4 = sum4 + 0;
		} else if (answer.equals("X") || answer.equals("x") || answer.equals("NO") || answer.equals("no")) {
			sum4++;
		}
		
		
		
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);
	}
}
//		 System.out.println("-----------------------"); // 0 or 1 일 때 E S T P 가 나오도록
		// ---------------------------------------------------
//		if (sum1 < 2 && sum2 < 2 && sum3 < 2 && sum4 < 2) { // System.out.println("ESTP인 당신");
//			System.out.println("어울리는 캐릭터는 쿠로미이있다.");
//		} else if (sum1 < 2 && sum2 < 2 && sum3 < 2) { // System.out.println("ESTJ");
//			System.out.println("어울리는 캐릭터는 헤르미온느 등이 있다.");
//		} else if (sum1 < 2 && sum2 < 2 && sum4 < 2) { // System.out.println("ESFP");
//			System.out.println("어울리는 캐릭터는 루피/토니스타크  가 있다.");
//		} else if (sum1 < 2 && sum2 < 2) { // System.out.println("ESFJ");
//			System.out.println("어울리는 캐릭터는 도라에몽/마더 테레사 이순신 도라에몽 가 있다.");
//		} else if (sum1 < 2 && sum3 < 2 && sum4 < 2) { // System.out.println("ENTP");
//			System.out.println("어울리는 캐릭터는 짱구/코난 가 있다.");
//		} else if (sum1 < 2 && sum3 < 2) { // System.out.println("ENTJ");
//			System.out.println("어울리는 캐릭터는 제임스 고슬링 가 있다.");
//		} else if (sum1 < 2 && sum4 < 2) { // System.out.println("ENFP");
//			System.out.println("어울리는 캐릭터는 뽀로로,둘리,스펀지밥,케로로 가 있다.");
//		} else if (sum1 < 2) {
//			// System.out.println("ENFJ"); System.out.println("어울리는 캐릭터는 피카츄,윤석열 가 있다.");
//		} else if (sum2 < 2 && sum3 < 2 && sum4 < 2) { // System.out.println("ISTP");
//			System.out.println("어울리는 캐릭터는 리바이 뮬란 등이 있다.");
//		} else if (sum2 < 2 && sum3 < 2) { // System.out.println("ISTJ");
//			System.out.println("어울리는 캐릭터는 징징이, 이병헌 강호동 가 있다.");
//		} else if (sum2 < 2 && sum4 < 2) { // System.out.println("ISFP");
//			System.out.println("어울리는 캐릭터는 해리포터, 강현욱 님 가 있다.");
//		} else if (sum2 < 2) { //
//			System.out.println("ISFJ");
//			System.out.println("어울리는 캐릭터는 박명회 선생님, 캡틴 아메리카, 김태희 송혜교 가 있다.");
//		} else if (sum3 < 2 && sum4 < 2) { // System.out.println("INTP");
//			System.out.println("어울리는 캐릭터는 권수민, 로드 존슨(스프링 창시자), 하이버네이트 창시자, 윤동주 김구 가 있다.");
//		} else if (sum3 < 2) { // System.out.println("INTJ");
//			System.out.println("어울리는 캐릭터는 타노스, 박지성 최민식 가 있다.");
//		} else if (sum4 < 2) { //
//			System.out.println("INFP");
//			System.out.println("어울리는 캐릭터는 마이 멜로디, 아이유 정유미 가 있다.");
//		} else { //
//			System.out.println("INFJ");
//			System.out.println("어울리는 캐릭터는 엘사, 예수, 히틀러 랩몬스터 박서준 가 있다.");
//		}

//	}
//}
