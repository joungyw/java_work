//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] lottoNumber = new int[15];


int counter = 0;
        for(int i = 0;i < lottoNumber.length; i++) {
            lottoNumber[i] = (int) (Math.random() * 45) + 1;
            while(true) {
                counter = 0;
                for (int j = 0; j < i; j++) {
                    if (lottoNumber[i] == lottoNumber[j]) {
                        counter++;
                    }
                }
                if (counter > 0) {
                    lottoNumber[i] = (int) (Math.random() * 45) + 1;
                } else {
                    break;
                }
            }

            System.out.println("counter = " + counter);
        }

        for(int i = 0; i < lottoNumber.length; i++){

            System.out.println(lottoNumber[i]+" ");



        }
    }
    }