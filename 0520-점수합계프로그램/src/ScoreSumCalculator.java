import java.util.Scanner;

public class ScoreSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int sum = 0; 

        while (true) {
            System.out.print("점수를 입력하세요 (종료하려면 음수를 입력): ");
            int score = scanner.nextInt(); 

            if (score < 0) {
                break; 
            }

            sum += score; 
        }

        System.out.println("점수의 총합은: " + sum);
    }
}
