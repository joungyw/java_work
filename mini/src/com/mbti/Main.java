package com.mbti;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String Type = "";
		String txt = "";
		MBTI as = new MBTI();

		System.out.println(as.wellcome);
		System.out.println("당신의 이름은?");
		String name = sc.nextLine();
		System.out.println(name + "님 반갑습니다.");
		System.out.println("당신의 성별은?");
		String gender = sc.nextLine();
		System.out.println(gender + "이시군요");
		System.out.println("반갑습니다.");
		System.out.println();

		System.out.println("문제를 드리겠습니다.");
		// Yes: 0 No: 1
		// ----------------------------------------------------
		System.out.println("Q1. 나는 사실  ");
		System.out.println("1번 : 백엔드보다 프론트엔드가 좋다. ");
		System.out.println("2번 : 백엔드가 잘 맞는다. ");
		int a = sc.nextInt();
		Sum.sumA(a);

		System.out.println("Q2. 나는 사실 ");
		System.out.println("1번 : 조원보다 조장이 되고 싶었다. ");
		System.out.println("2번 : 조원으로 만족한다.");
		a = sc.nextInt();
		Sum.sumA(a);

		System.out.println("Q3.나는 관종이다.");
		System.out.println("1번 : 그렇다.");
		System.out.println("2번 : 아니다. ");

		a = sc.nextInt();
		Sum.sumA(a);

		// Yes 2개 이상 -> E 출력
		System.out.println("-----------------------");
		// ---------------------------------------------------
		System.out.println("Q4.선생님이 모르는 걸 알려주실 때 나는");
		System.out.println("1번 : 그러려니 하고 외운다.");
		System.out.println("2번 : 외우기 전에 원리를 이해하고 싶다. ");
		int b = sc.nextInt();
		Sum.sumB(b);

		System.out.println("Q5.보조 선생님 학원에서 우리 반 감시하라고 보낸 스파이 아니에요?");
		System.out.println("1번 : 뭐 그런 생각까지 해?");
		System.out.println("2번 : 마음속으로 스파이가 된 자신을 상상해 본다.");
		b = sc.nextInt();
		Sum.sumB(b);

		System.out.println("Q6.지금부터 아무것도 생각하지 마!");
		System.out.println("1번 : (생각 안 함)");
		System.out.println("2번 : 생각을 안 하는 게 뭐지? 생각을 안 한다고 생각하는 건 생각을 하는 건가? " + "생각을 하지 않는 건가? 아무 생각도 안 하는 게 가능해? ");
		b = sc.nextInt();
		Sum.sumB(b);

		System.out.println("-----------------------"); //
		// Yes 2개 이상 -> S 출력 System.out.println("-----------------------"); //
//		 ---------------------------------------------------
		System.out.println("Q7.약속 시간에 1시간이나 늦은 친구,");
		System.out.println("1번 : 사과 이전에 늦은 이유가 궁금하다.");
		System.out.println("2번 : 친구의 진심을 담은 사과에 마음이 풀린다. ");
		int c = sc.nextInt();
		Sum.sumC(c);

		System.out.println("Q8.나는 대화를 할 때");
		System.out.println("1번 : 사람보다 챗지피티와 대화하는 게 편하다.");
		System.out.println("2번 : 당연히 사람이 더 편하다.");
		c = sc.nextInt();
		Sum.sumC(c);

		System.out.println("Q9.더 기분 좋은 칭찬은?");
		System.out.println("1번 : 너 천재임?");
		System.out.println("2번 : 너 천사임?");
		c = sc.nextInt();
		Sum.sumC(c);

		// Yes 2개 이상 -> T 출력
		System.out.println("-----------------------"); //
//		  --------------------------------------------------- // Yes 2개 이상 -> P 출력
		System.out.println("Q10.할 일이 쌓였을 때");
		System.out.println("1번 : 손에 집히는 대로 시작한다. ");
		System.out.println("2번 : 우선 계획을 세운다. ");
		int d = sc.nextInt();
		Sum.sumD(d);

		System.out.println("Q11.둘 중 더 나은 상황은?");
		System.out.println("1번 : 아무 일정이 없을 때 ");
		System.out.println("2번 :  모든 일정이 정해져 있을 때");
		d = sc.nextInt();
		Sum.sumD(d);

		System.out.println("Q12.팀플에서 내가 맡고 싶은 일은?");
		System.out.println("1번 : 정리하고 기록하는 일");
		System.out.println("2번 : 아이디어를 내는 일");
		d = sc.nextInt();
		Sum.sumD(d);

		// 0 or 1 일 때 E S T P 가 나오도록 수정
		// ---------------------------------------------------

		if (Sum.sum1 < 2 && Sum.sum2 < 2 && Sum.sum3 < 2 && Sum.sum4 < 2) {
			// System.out.println("ESTP인 당신");
			Type = "쿠로미";
			txt = "";			
		} else if (Sum.sum1 < 2 && Sum.sum2 < 2 && Sum.sum3 < 2) {
			// System.out.println("ESTJ");		
			Type = "세일러 마스";
			txt = "세일러 마스는 열정적이고 용감하며, 친구들을 위해 헌신하는 동시에 자신만의 강한 신념을 가진 우아하고 강렬한 성격의 캐릭터이다.";
		} else if (Sum.sum1 < 2 && Sum.sum2 < 2 && Sum.sum4 < 2) {
			// System.out.println("ESFP");
			Type = "루피";
			txt = "루피는 무모하면서도 열정적이며, 끈질기고 용감한 해적으로, 친구들을 위해 언제나 최선을 다하는 쾌활하고 긍정적인 성격을 가진 캐릭터이다.";
		} else if (Sum.sum1 < 2 && Sum.sum2 < 2) {
			// System.out.println("ESFJ");
			Type = "도라에몽";
			txt = "도라에몽은 게으르면서도 창의적이며, 매우 지적이면서도 가끔은 고집 센 면이 있는 고양이로, 신기한 도구와 재미있는 모험을 좋아하는 캐릭터이다.";
		} else if (Sum.sum1 < 2 && Sum.sum3 < 2 && Sum.sum4 < 2) {
			// System.out.println("ENTP");
			Type = "짱구";
			txt = "짱구는 장난기 많고 호기심 많으며, 항상 유쾌하고 즐거운 에너지로 가득한 소년으로, 친구들과의 다양한 모험을 통해 일상을 밝게 만든다.";
		} else if (Sum.sum1 < 2 && Sum.sum3 < 2) {
			// System.out.println("ENTJ");
			Type = "프리저";
			txt = "프리저는 냉철하고 무자비한 전투 정신을 지닌 용병으로, 냉담하고 계산적인 성향을 가진 동시에 강력한 힘을 자랑하는 캐릭터이다.";
		} else if (Sum.sum1 < 2 && Sum.sum4 < 2) {
			// System.out.println("ENFP");
			Type = "뽀로로";
			txt = "뽀롱뽀롱 뽀로로는 호기심 많고 활발한 성격의 펭귄으로, 친구들과의 모험과 재미를 즐기며 항상 긍정적이고 쾌활한 에너지를 풍긴다.";
		} else if (Sum.sum1 < 2) {
			// System.out.println("ENFJ");
			Type = "피카츄";
			txt = "피카츄는 활기차고 호기심 많으며, 친근하고 사람들과의 소통을 즐기며 항상 밝고 긍정적인 에너지를 가진 포켓몬입니다.";
		} else if (Sum.sum2 < 2 && Sum.sum3 < 2 && Sum.sum4 < 2) {
			// System.out.println("ISTP");
			Type = "뮬란";
			txt = "뮬란은 용감하고 결단력 있으며, 전통적인 성별 역할에 도전하며 가족과 국가를 위해 헌신하는 자유로운 영혼의 여성 캐릭터입니다.";
		} else if (Sum.sum2 < 2 && Sum.sum3 < 2) {
			// System.out.println("ISTJ");
			Type = "징징이";
			txt = "징징이는 늘 현실적이고 주변 상황에 예민하게 반응하면서도, 자신의 생각과 감정을 솔직하게 표현하는 친절하고 정직한 성격을 가진 캐릭터입니다.";
		} else if (Sum.sum2 < 2 && Sum.sum4 < 2) {
			// System.out.println("ISFP");
			Type = "해리포터";
			txt = "해리 포터는 용기와 헌신, 정의감을 지닌 소년으로, 어려운 환경에서도 자신의 가치를 지켜내며 친구들과 함께 어려운 시련에 맞서는 강인한 캐릭터입니다.";
		} else if (Sum.sum2 < 2) {
			// System.out.println("ISFJ");
			Type = "캡틴 아메리카";
			txt = "뛰어난 도덕성과 헌신적인 성격으로 알려져 있으며, 정의를 위해 희생을 감수하고 동료들을 지키려는 강인하면서도 헤로익적인 영웅이다.";
		} else if (Sum.sum3 < 2 && Sum.sum4 < 2) {
			// System.out.println("INTP");
			Type = "셜록홈즈";
			txt = "안락의자에 편안히 앉아서 미스터리를 해결하는 안락의자 탐정 셜록 홈즈, 그 뛰어난 추리력과 냉철한 두뇌로 다양한 사건들을 해결하는 영국의 전설적인 캐릭터이다.";
		} else if (Sum.sum3 < 2) {
			// System.out.println("INTJ");
			Type = "타노스";
			txt = "타노스는 광대한 우주를 지배하려는 광적인 욕망과 무자비한 힘을 지닌 악당으로, 자신의 이념에 따라 인구 조절을 위해 극단적인 행동을 일삼는 끈질긴 야심가이다.";
		} else if (Sum.sum4 < 2) {
			// System.out.println("INFP");
			Type = "마이 멜로디";
			txt = "";
		} else {
			// System.out.println("INFJ");
			Type = "엘사";
			txt = "엘사는 강력한 얼음 마법을 지닌 여왕으로, 책임감 있고 강인한 성격이지만 내면에는 따뜻한 마음을 품은 디즈니의 주인공이다.";
		}
		System.out.print(as.mod1);
		System.out.print(as.mod2);
		System.out.print(as.mod3);
		System.out.println(as.mod4);
		System.out.println("#" + name + "#" + "님과 닳은 캐릭터는 #" + Type + "# 입니다.");
		System.out.println("#" + txt + "#");

	}
}