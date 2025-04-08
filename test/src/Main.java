//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean boolRslt = false;


        System.out.print("국어 점수를 입력하세요 >>>");
        int kor = sc.nextInt();

        System.out.print("영어 점수를 입력하세요 >>>");
        int eng = sc.nextInt();

        System.out.print("수학 점수를 입력하세요 >>>");
        int mat = sc.nextInt();

        System.out.print("과학 점수를 입력하세요 >>>");
        int sci = sc.nextInt();

        int sum = (kor + eng + mat + sci);
        int intAvg = (kor + eng + mat + sci) / 4;
        double doubleAvg = (kor + eng + mat + sci) / 4.0;
        boolRslt = intAvg == doubleAvg;

        System.out.println("합계 점수는 : " + sum);
        System.out.println("정수 평균 점수는 : " + intAvg);
        System.out.println("실수 평균 점수는 : " + doubleAvg);
        System.out.println("정수 평균과 실수 평균이 같은가? " + boolRslt);


        }

    }
