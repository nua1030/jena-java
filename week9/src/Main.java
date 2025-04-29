import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요 >>>");
        int x = sc.nextInt();

        if ( 0 <= x && x <= 100)
            System.out.println("1에서 100 사이의 값입니다.");
        else
            System.out.println("1에서 100 사이의 값이 아닙니다.");
    }

}
