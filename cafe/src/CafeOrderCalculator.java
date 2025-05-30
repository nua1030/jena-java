import java.util.Scanner;

public class CafeOrderCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 음료 선택
        System.out.println("음료를 선택하세요: 1-아메리카노, 2-카페라떼, 3-카푸치노");
        int drinkChoice = scanner.nextInt();

        int basePrice = 0;
        switch (drinkChoice) {
            case 1:
                basePrice = 3000;
                break;
            case 2:
                basePrice = 4000;
                break;
            case 3:
                basePrice = 4500;
                break;
            default:
                System.out.println("지원하지 않는 음료입니다. 프로그램을 종료합니다.");
                return; // 프로그램 종료
        }

        // 2. 크기 선택
        System.out.println("크기를 선택하세요: 1-Small, 2-Medium, 3-Large");
        int sizeChoice = scanner.nextInt();

        int sizePrice = 0;
        switch (sizeChoice) {
            case 1:
                sizePrice = 0; // Small 추가 요금 없음
                break;
            case 2:
                sizePrice = 500; // Medium
                break;
            case 3:
                sizePrice = 1000; // Large
                break;
            default:
                System.out.println("지원하지 않는 크기입니다. 프로그램을 종료합니다.");
                return; // 프로그램 종료
        }

        // 3. 옵션 선택
        System.out.println("옵션을 선택하세요: 1-기본, 2-샷추가, 3-시럽추가, 4-샷+시럽추가");
        int optionChoice = scanner.nextInt();

        int optionPrice = 0;
        switch (optionChoice) {
            case 1:
                optionPrice = 0; // 기본
                break;
            case 2:
                optionPrice = 500; // 샷 추가
                break;
            case 3:
                optionPrice = 300; // 시럽 추가
                break;
            case 4:
                optionPrice = 800; // 샷과 시럽 둘 다 추가
                break;
            default:
                System.out.println("지원하지 않는 옵션입니다. 프로그램을 종료합니다.");
                return; // 프로그램 종료
        }

        // 4. 최종 가격 계산
        int totalPrice = basePrice + sizePrice + optionPrice;

        // 5. 결과 출력
        System.out.println("최종 가격은 " + totalPrice + "원입니다.");

        scanner.close(); // 스캐너 닫기
    }
}
