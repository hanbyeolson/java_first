/*
    손한별 |
    미니과제 06
*/


import java.util.Scanner;

public class 미니과제06 {
    public static void main(String[] args){
        System.out.print("[투표진행율]: ");
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();

        int[] candidate = new int[4];
        String[] name = new String[]{"이재명","윤석열","심상정","안철수"};


        for(int i = 1; i<=total; i++) {
            int vote = (int)(Math.random() * 4);
            candidate[vote]++;
            System.out.println();
            System.out.printf("[투표진행율]: %05.02f%c, %d명 투표 => %s\n",((double) candidate[vote] / (double)total) * 100.0f,'%', (int)candidate[vote], name[vote]);
            System.out.printf("[기호:1] 이재명: %05.02f%c, (투표수: %d)\n",((double) candidate[0] / (double)total) * 100.0f,'%', candidate[0]);
            System.out.printf("[기호:2] 윤석열: %05.02f%c, (투표수: %d)\n",((double) candidate[1] / (double)total) * 100.0f,'%', candidate[1]);
            System.out.printf("[기호:3] 심상정: %05.02f%c, (투표수: %d)\n",((double) candidate[2] / (double)total) * 100.0f,'%', candidate[2]);
            System.out.printf("[기호:4] 안철수: %05.02f%c, (투표수: %d)\n",((double) candidate[3] / (double)total) * 100.0f,'%', candidate[3]);

            if(i == total) {
                int maxValue = 0;
                for (int j = 0; j < 4; j++) {
                    if(maxValue < candidate[j]) {
                        maxValue = candidate[j];
                    }
                }
                int sameCount = 0;
                for(int j=0; j<4; j++) {
                    if(maxValue == candidate[j]) {
                        sameCount++;
                    }
                }

                if(sameCount > 1) {
                    i--;
                }
            }
        }

        int maxValue = 0;
        String winner = new String();
        for(int i=0; i<4; i++) {
            if(maxValue < candidate[i]) {
                maxValue = candidate[i];
                winner = name[i];
            }
        }

        System.out.printf("[투표결과] 당선인: %s\n", winner);
    }

}
