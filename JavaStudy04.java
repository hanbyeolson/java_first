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

        String str;
        str = sc.nextLine();
        int gendernum = 0;

        if (gendernum == 'f') {
            gendernum = 4;
        } else if (gendernum == 'm') {
            gendernum = 3;
        }

        int year;
        int month;
        int day;
        String gender;
        
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(year))
                .append(month >= 10? month : String.format("%02d", month))
                .append(day >= 10 ? day : String.format("%02d", day))
                .append("-")
                .append(gendernum)
                .append(new Random().nextInt(1000000));

            Scanner kb = new Scanner(System.in);

            while(true) {
                System.out.print("출생년도를 입력해 주세요.(yyyy):");
                year = kb.nextInt();

                if(year < 1000 || year > 2022) {
                    System.out.println("출생년도 입력이 잘못되었습니다. 다시 시작합니다.\n");
                    continue;
                }
                System.out.print("출생월을 입력해 주세요.(mm):");
                month = kb.nextInt();
            
                if(month <= 0 || month > 12) {
                    System.out.println("출생월 입력이 잘못되었습니다. 다시 시작합니다.\n");
                    continue;
                }

                System.out.print("출생일을 입력해 주세요.(dd):");
                day = kb.nextInt();
                
                if(day <= 0 || day > 31) {
                    System.out.println("출생일 입력이 잘못되었습니다. 다시 시작합니다.\n");
                    continue;
                }
                System.out.print("성별을 입력해 주세요.(m/f):");
                gender = String.valueOf(Character.toLowerCase(kb.next().charAt(0)));
               
                
                if(gender == "m" && gender == "f") {
                    System.out.println("성별 입력이 잘못되었습니다. 다시 시작합니다.\n");
                    continue;
                }

                break;
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
