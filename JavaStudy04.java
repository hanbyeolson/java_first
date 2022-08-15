/*
    손한별 |
    미니과제 04
*/

import java.util.Random;
import java.util.Scanner;

public class 미니과제04 {
    public static void main(String[] args) {
        System.out.println("[주민등록번호 계산]");

        Scanner sc = new Scanner(System.in);



        System.out.print("출생년도를 입력해 주세요.(yyyy):");
        int year = sc.nextInt();

        System.out.print("출생월을 입력해 주세요.(mm):");
        int month = sc.nextInt();

        System.out.print("출생일을 입력해 주세요.(dd):");
        int day= sc.nextInt();

        System.out.print("성별을 입력해 주세요.(m/f):");
        String gender = String.valueOf(sc.nextLine());



        String str;
        str = sc.nextLine();

        if (gender.equals("f")) {
            gender = "4";
        } else if (gender.equals("m")) {
            gender = "3";
        }

        int num = 0;
        String randomNum = "";


        Random random = new Random();
        for (int i = 0; i <7; i++) {
            num = random.nextInt(9);
            randomNum += Integer.toString(num);
        }


        System.out.printf("%s%02d%02d-%d%s",year,month,day,gender,randomNum);


    }
}
