/*
    손한별 |
    미니과제 05
*/


import java.time.LocalDate;
import java.util.Scanner;

public class 미니과제05 {
    public static void main(String[] args){
        System.out.println("[달력 출력 프로그램]");

        Scanner sc = new Scanner(System.in);

        System.out.print("달력의 년도를 입력해 주세요.(yyyy):");
        int year = sc.nextInt();

        System.out.print("달력의 월을 입력해 주세요.(mm):");
        int month = sc.nextInt();

        System.out.println();
        System.out.println();


        String[] strWeek= {"일","월","화","수","목","금","토"};
        System.out.println("["+year+"년 "+month+"월]");

        LocalDate date = LocalDate.of(year, month, 1);
        int getDayOfWeek = date.getDayOfWeek().getValue();

        for(String week:strWeek)
        {
            System.out.print(week+"\t");
        }

        int total=(year-1)*365
                +(year-1)/4
                -(year-1)/100
                +(year-1)/400;


        int[] lastDay= {31,28,31,30,31,30,31,31,30,31,30,31};
        if((year%4==0 && year%100!=0)||(year%400==0))
            lastDay[1]=29;
        else
            lastDay[1]=28;

        for(int i=0;i<month-1;i++)
        {
            total+=lastDay[i];
        }

        total++;

        int week=total%7;

        System.out.println();
        for(int i=1;i<=lastDay[month-1];i++)
        {
            if(i==1)
            {
                for(int j=0;j<week;j++)
                {
                    System.out.print("\t");
                }
            }
            System.out.printf("%2d\t",i);
            week++;
            if(week>6)
            {
                week=0;
                System.out.println();
            }
        }
    }
}
