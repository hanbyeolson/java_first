/*
    손한별 |
    미니과제 03
*/


import java.util.Scanner;

    public class 미니과제03  {
        public static void main(String[] args) {
            System.out.println("[입장권 계산]");

            Scanner sc = new Scanner(System.in);


            System.out.print("나이를 입력해 주세요.(숫자):");
            int age = sc.nextInt();

            System.out.print("입장시간을 입력해 주세요.(숫자입력):");
            int time = sc.nextInt();

            System.out.print("국가유공자 여부를 입력해 주세요.(y/n):");
            String k = sc.next();

            System.out.print("복지카드 여부를 이력해 주세요.(y/n):");
            String c = sc.next();

            int money = sc.nextInt();

            System.out.println();

            if (age < 3) {
                System.out.println("입장료: 무료 입니다.");
            } else if (age < 13){
                System.out.println("입장료: 40000");
            } else if (age > 13){
                System.out.println("입장료: 100000");
            } else if (time > 17){
                System.out.println("입장료: 40000");
            } else if (k.equals("y") ) {
                System.out.println("입장료: 8000");
            } else if (c.equals("y")) {
                System.out.println("입장료: 8000");
            } else {
                System.out.println("입장료: 10000");
            }

        }
    }
