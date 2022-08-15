/*
    손한별 |
    미니과제 02
*/


import java.util.Scanner;

public class 미니과제02 {
        public static void main (String[] args) {

            System.out.println("[캐시백 계산]");
            System.out.print("결제 금액을 입력해 주세요. (금액):");

            Scanner i = new Scanner(System.in);
            int back = 0;


            int money = i.nextInt();
            back = 0;
            back = money / 10;

            if (back >= 300) {
                back = 300;
                System.out.printf("결제 금액은" + money + "이고, 캐시백은" + back + "원 입니다.");
            } else if (back >= 200) {
                back = 200;
                System.out.printf("결제 금액은" + money + "이고, 캐시백은" + back + "원 입니다.");
            } else if (back >= 100) {
                back = 100;
                System.out.printf("결제 금액은" + money + "이고, 캐시백은" + back + "원 입니다.");
            } else {
                back = 0;
                System.out.printf("결제 금액은" + money + "이고, 캐시백은" + back + "원 입니다.");
            }


        }

}
