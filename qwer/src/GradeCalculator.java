import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 점수 입력 받기
        System.out.print("점수를 입력하세요 (0~100): ");
        int score = scanner.nextInt();

        // 유효성 검사
        if (score < 0 || score > 100) {
            System.out.println("잘못된 점수입니다. 0~100 사이의 정수를 입력해주세요.");
            return;
        }

        // 점수를 10으로 나누어 학점 계산
        switch (score / 10) {
            case 10: // 100점
            case 9:
                System.out.println("학점은 A입니다.");
                break;
            case 8:
                System.out.println("학점은 B입니다.");
                break;
            case 7:
                System.out.println("학점은 C입니다.");
                break;
            case 6:
                System.out.println("학점은 D입니다.");
                break;
            default:
                System.out.println("학점은 F입니다.");
                break;
        }

        scanner.close();
    }
}
