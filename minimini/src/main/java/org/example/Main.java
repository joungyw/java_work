package org.example;

import org.example.question.QDB;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Point point = new Point();
        Main main = new Main();

        Scanner sc = new Scanner(System.in);
        System.out.println(Code.MBTI);


        System.out.println("당신의 이름은?");
        String name = sc.nextLine();
        System.out.println("당신의 성별은?");
        String gender = sc.nextLine();
        System.out.println(name + "님 이시군요");
        System.out.println("반갑습니다.");
        System.out.println("문제를 드리겠습니다.");

        String txt = "";
        String type = "";
        String mbti = "";
        Code as = new Code();
        QDB qdb = new QDB();
        System.out.println();

        for (int i = 1; i < 13; i++) {
            System.out.println();
            System.out.println(i + "번");
            qdb.Q(i);
            qdb.AS(i);

                int answer = sc.nextInt();
            do {
                System.out.println();

                if (answer != 1 && answer != 2) {
                    System.out.println("다시 입력해주세요");
                    System.out.println(i + "번");
                    qdb.Q(i);
                    qdb.AS(i);
                  answer = sc.nextInt();
                }

            } while (answer != 1 && answer != 2);


                if (i < 4) {
                    point.con(answer);
                    if (i == 3) {
                        Point.IE += Point.sum;
                        Point.sum = 0;
                    }
                } else if (i < 7) {
                    point.con(answer);
                    if (i == 6) {
                        Point.NS += Point.sum;
                        Point.sum = 0;
                    }
                } else if (i < 10) {
                    point.con(answer);
                    if (i == 9) {
                        Point.FT += Point.sum;
                        Point.sum = 0;
                    }
                } else if (i < 13)
                    point.con(answer);
                if (i == 12)
                    Point.JP += Point.sum;
        }


        if (Point.IE < 5 && Point.NS < 5 && Point.FT < 5 && Point.JP < 5) {
            mbti = "ESTP";
            as.tp(1);
            type = "쿠로미";
            txt = "쿠로미는 귀여운 외모와 더불어 적극적이며 열정적인 쿨내나는 캐릭터입니다.\n" +
                    "\n" +
                    "#YOLO #임기응변 #선입견 없음 #분위기 잘탐\n" +
                    "#스릴♡모험♡여행♡ #쿨함의 대명사 #가끔 공격적\n";

        } else if (Point.IE < 5 && Point.NS < 5 && Point.FT < 5) {
            mbti = "ESTJ";
            as.tp(2);
            type = "세일러 마스";
            txt = "세일러 마스는 우아하고 열정적인 동료애를 가진 정의롭고 카리스마 있는 캐릭터입니다.\n" +
                    "\n" +
                    "#완벽주의 #자신감 #창의력부족 #결단력\n" +
                    "#빈틈없음 #워커홀릭 #똑부러짐 #꼰대\n";

        } else if (Point.IE < 5 && Point.NS < 5 && Point.JP < 5) {
            mbti = "ESFP";
            as.tp(3);
            type = "루피";
            txt = "루피는 무모하지만 용감한 해적으로 매사에 최선을 다하는 쾌활하고 긍정적인 원피스의 주인공입니다.\n" +
                    "\n" +
                    "#분위기 메이커 #행동파 #때때로 산만 #낙관주의자\n" +
                    "#매사에 즐거움 #공사구별 어려움 #붙임성 #음식사진 다량보유\n";

        } else if (Point.IE < 5 && Point.NS < 5) {
            mbti = "ESFJ";
            as.tp(4);
            type = "도라에몽";
            txt = "도라에몽은 착하지만 가끔 고집이 센 로봇 고양이로, 진구의 든든한 조력자입니다.\n" +
                    "\n" +
                    "#칭찬 자판기 #오지랖 #가정적 #관심에 민감\n" +
                    "#팔랑귀 #정많음 #팀플 선호 #서비스 정신 투철\n";

        } else if (Point.IE < 5 && Point.FT < 5 && Point.JP < 5) {
            mbti = "ENTP";
            as.tp(5);
            type = "짱구";
            txt = "짱구는 호기심 넘치는 장난기 가득한 아이로 친구들과 함께 모험을 즐기는 캐릭터입니다.\n" +
                    "\n" +
                    "#논쟁가 #마이웨이 #겉인싸 속아싸 #고집쎔\n" +
                    "#다재다능 #아이디어 부자 #실행력은 약함 #난 언제나 옳아\n";

        } else if (Point.IE < 5 && Point.FT < 5) {
            mbti = "ENTJ";
            as.tp(6);
            type = "프리저";
            txt = "프리저는 냉철하고 계산적인 성향을 가진 동시에 독보적인 힘과 권력을 자랑하는 드래곤볼의 캐릭터입니다.\n" +
                    "\n" +
                    "#야망가 #극도의 효율 추구 #독재자 #공감능력부족\n" +
                    "#솔직 #워커홀릭 #철저한 공사구분 #제임스 고슬링\n";


        } else if (Point.IE < 5 && Point.JP < 5) {
            mbti = "ESFP";
            as.tp(7);
            type = "뽀로로";
            txt = "뽀로로는 호기심 많고 활발한 성격의 펭귄으로, 모험을 즐기며 쾌활한 에너지를 뿜어냅니다.\n" +
                    "\n" +
                    "#이동건 #불타는 열정 #감성 충만 #자유로운 영혼\n" +
                    "#생각하기 전 행동 #친화력의 화신 #관종 #하지만은근낯가림\n";

        } else if (Point.IE < 5) {
            mbti = "ESFJ";
            as.tp(8);
            type = "피카츄";
            txt = "피카츄는 항상 주인공의 곁을 지키는 정의롭고 충실한 친구같은 포켓몬입니다.\n"
                    + "\n" +
                    "#붙임성 #자기관리 #소수보단 다수의 친구 #손절 잘 못함\n" +
                    "#의리파 #멘탈강함 #핵인싸 #감수성 풍부 #알잘딱깔센\n";
        } else if (Point.NS < 5 && Point.FT < 5 && Point.JP < 5) {
            mbti = "ISTP";
            as.tp(9);
            type = "뮬란";
            txt = "뮬란은 결단력이 있으며, 전통적인 고정관념에 정면으로 맞서는 자유로운 영혼의 디즈니 캐릭터입니다.\n"
                    + "\n" +
                    "#인생은 혼자 #겉바속촉 #장인정신 #타인에 무관심\n" +
                    "#마이웨이 #기브앤테이크 #빈말 못함 #심플이즈베스트\n";
        } else if (Point.NS < 5 && Point.FT < 5) {
            mbti = "ISTJ";
            as.tp(10);
            type = "징징이";
            txt = "징징이는 스폰지밥의 이웃으로 늘 예민하지만 정직하고 깊은 인내심을 가진 캐릭터입니다.\n"
                    + "\n" +
                    "#보수적 #질서정연 #남모를 취미 #슈퍼 진지\n" +
                    "#모범생 #동방예의지국 #인내 #현실적 #한국인 표준\n";
        } else if (Point.NS < 5 && Point.JP < 5) {
            mbti = "ISFP";
            as.tp(11);
            type = "해리포터";
            txt = "해리포터는 강인함을 지닌 마법사로, 소심한 면모가 있지만 누구보다 강인하게 시련에 맞서는 캐릭터입니다.\n"
                    + "\n" +
                    "#겸손 #친절 #평등 #현재를 즐김 #나만의 공간\n" +
                    "#소극적 #부드러움 #서포트특화 #강현욱\n";
        } else if (Point.NS < 5) {
            mbti = "ISFJ";
            as.tp(12);
            type = "캡틴 아메리카";
            txt = "캡틴 아메리카는 뛰어난 도덕성을 바탕으로 정의를 위해 싸우는 히어로 캐릭터입니다.\n"
                    + "\n" +
                    "#예의바름 #참다가 선넘으면 칼차단 #부담多 #성실\n" +
                    "#속깊음 #주변인 잘챙김 #평화주의자 #박명회 선생님\n";
        } else if (Point.FT < 5 && Point.JP < 5) {
            mbti = "INTP";
            as.tp(13);
            type = "셜록홈즈";
            txt = "셜록홈즈는 뛰어난 추리력과 냉철한 두뇌를 바탕으로 미스터리한 사건들을 해결해 나가는 탐정입니다.\n"
                    + "\n" +
                    "#인간적인 로봇 #게으른 천재 #개인주의 #팩폭\n" +
                    "#귀차니스트 #빈말 못함 #목적없는 지식탐구 #권수민\n";

        } else if (Point.FT < 5) {
            mbti = "INTJ";
            as.tp(14);
            type = "타노스";
            txt = "타노스는 극단적인 신념을 가지고 인류를 심판하려 드는 빌런 캐릭터입니다.\n"
                    + "\n" +
                    "#멍청하면 손절 #블랙유머 #독립적 #가장 로봇같은 인간\n" +
                    "지적활동 #은근허당 #능력주의 #귀여운거좋아 #자기반성\n";

        } else if (Point.JP < 5) {
            mbti = "INFP";
            as.tp(15);
            type = "마이 멜로디";
            txt = "마이 멜로디는 순수하고 착한 토끼로 마음이 약하지만 여차할 때는 용기를 내는 캐릭터입니다.\n"
                    + "\n" +
                    "#감성충만 #평화주의 #잡생각多多 #눈치많이봄\n" +
                    "#감정이입 #이상과 현실의 괴리 #망상多多 #예술적 기질\n";

        } else {
            mbti = "INFJ";
            as.tp(16);
            type = "엘사";
            txt = "엘사는 언제나 책임감 있고 강인하지만 그 내면에는 따뜻한 마음을 품고 있는 캐릭터입니다.\n"
                    + "\n" +
                    "#외강내유 #좁고 깊은 인간관계 #극단적 #생각多\n" +
                    "#겸손 #완벽주의 #애늙은이 #예수와 히틀러가 공존\n";
        }

        System.out.println("##################################################################");
        System.out.println(Code.mod);
        System.out.println("##################################################################");
        System.out.println("E = " + Point.E + "%" + "\t\t\t" + "I = " + Point.I + "%");
        System.out.println("S = " + Point.S + "%" + "\t\t\t" + "N = " + Point.N + "%");
        System.out.println("T = " + Point.T + "%" + "\t\t\t" + "F = " + Point.F + "%");
        System.out.println("P = " + Point.P + "%" + "\t\t\t" + "J = " + Point.J + "%");

        System.out.println();
        System.out.println("#" + name + "#" + "님과 닳은 캐릭터는 #" + type + "# 입니다.");
        System.out.println("#" + txt + "#");
        System.out.println("##################################################################");

    }


}


