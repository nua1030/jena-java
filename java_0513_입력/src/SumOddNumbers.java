import java.util.Scanner;

public class SumOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 입력 받기
        System.out.print("숫자를 입력하세요: ");
        int n = scanner.nextInt();

        int sum = 0; // 홀수의 합을 저장할 변수

        // 1부터 n까지 반복
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) { // 홀수인지 확인
                sum += i; // 홀수라면 합에 더함
            }
        }

        // 결과 출력
        System.out.println("홀수의 합: " + sum);
    }
}
