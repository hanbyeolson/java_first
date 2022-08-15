/*
    손한별 |
    미니과제 08
*/


import java.util.Scanner;

public class 미니과제08 {
    public static void main(String[] args){

        int income;
        int tax;

        Scanner sc = new Scanner(System.in);

        System.out.println("[과세금액 계산 프로그램]");
        income = sc.nextInt();

        if (income <= 1000) {
            tax = (int)(income * 0.09);
        } else if (income <= 4000) {
            tax = (int)(income * 0.18);
        } else if (income <= 8000) {
            tax = (int)(income * 0.27);
        }else {
            tax = (int)(income * 0.36);
        }

        System.out.print("연소득을 입력해 주세요.:");

        System.out.println();

        System.out.print("[세율에 의한 세금]:     ");
        System.out.print("[누진공제 계산에 의한 세금]:   ");
    }
}
