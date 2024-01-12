import java.util.Arrays;

public class Ex05 {
    public static void main(String[] args) {

        String[] student1 = {"홍길동","80","90","100"};
        String[] student2 = {"이길동","70","60","80"};
        String[] student3 = {"박길동","100","90","40"};

        String[][] all = {student1,student2,student3};

        System.out.println("학생의 숫자 = "+all.length+"명" );

        int a = 0;
        int b = 0;
        int c = 0;

        for(int i = 0; i < all.length; i++){
            a += Integer.parseInt(all[i][1]);
            b += Integer.parseInt(all[i][2]);
            c += Integer.parseInt(all[i][3]);}

        System.out.println("국어점수의 총합 = "+ a);
        System.out.println("국어점수의 평균 = "+ a/all.length);

        System.out.println("영어점수의 총합 = "+ b);
        System.out.println("영어점수의 평균 = "+ b/all.length);

        System.out.println("수학점수의 총합 = "+ c);
        System.out.println("수학점수의 평균 = "+ c/all.length);

        System.out.println("모든 점수의 평균");
        System.out.println((a+b+c)/9);

        int student_total[] = new int[3];


        for(int i = 0; i < 3; i++) {
            for (int j = 1; j < 4; j++) {
                student_total[1] += Integer.parseInt(all[i][j]);
            }
        }

        System.out.println(Arrays.toString(student_total));


    }
}
