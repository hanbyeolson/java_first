/*
    손한별 |
    미니과제 01
*/
public class Main {
    public static void main(String[] args) {
        System.out.println("[구구단 출력]");

        for (int i = 1; i <= 9; i++){
            System.out.println();
            for (int j = 1; j <= 9; j++ ){
                System.out.format("%d X %d = %2d ", i, j, i * j);
            }
        }
    }
}
