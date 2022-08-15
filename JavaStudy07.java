/*
    손한별 |
    미니과제 07
*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 미니과제07 {
    public static void main(String[] args){
        System.out.println("[로또 당첨 프로그램]");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        ArrayList<int[]> listNumber = new ArrayList<>();
        int buy;
        char orderNumber = 'A';
        int[] outputNumber;
        int[] winningNumber;


        System.out.print("로또 개수를 입력해 주세요.(숫자 1 ~ 10):");
        buy = sc.nextInt();

        for (int i = 0; i < buy; i++) {
            listNumber.add(i, lottoNumberCreate());
        }

        for (int i = 0; i < listNumber.size(); i++) {
            outputNumber = new int[6];
            for (int j = 0; j < outputNumber.length; j++) {
                outputNumber = listNumber.get(i);
                if (j == 0) {
                    System.out.printf("%s\t%02d", orderNumber, outputNumber[j]);
                } else if (j < outputNumber.length - 1) {
                    System.out.printf(",%02d", outputNumber[j]);
                } else {
                    System.out.printf(",%02d\n", outputNumber[j]);
                }
            }
            if (i < listNumber.size() - 1) {
                orderNumber++;
            } else {
                orderNumber = 'A';
                System.out.println();
            }
        }

        System.out.println();

        System.out.println("[로또 발표]");
        System.out.println("   02,11,25,33,37,41");
        System.out.println();

        System.out.println("[내 로또 결과]");
        for (int i = 0; i < listNumber.size(); i++) {
            int cnt = 0;
            outputNumber = listNumber.get(i);

            for (int j = 0; j < outputNumber.length; j++) {
                for (int k = 0; k < outputNumber.length; k++) {
                    if (outputNumber[j] == outputNumber[k]) {
                        cnt++;
                    }
                }
                if (j == 0) {
                    System.out.printf("%s\t%02d", orderNumber, outputNumber[j]);
                } else if (j < outputNumber.length - 1) {
                    System.out.printf(",%02d", outputNumber[j]);
                } else {
                    System.out.printf(",%02d => %d개 일치\n", outputNumber[j], cnt);
                }
            }
            if (i < listNumber.size() - 1) {
                orderNumber++;
            } else {
                orderNumber = 'A';
                System.out.println();
            }
        }
    }

    private static int[] lottoNumberCreate() {
        int[] inputNumber = new int[6];

        for (int i = 0; i < inputNumber.length; i++) {
            inputNumber[i] = (int) (Math.random() * 45) + 1;
            for (int j = 0; j < i; j++){
                if (inputNumber[i] == inputNumber[j]) {
                    i--;
                    break;
                }
            }
        }
        Arrays.sort(inputNumber);
        return inputNumber;
    }
}
