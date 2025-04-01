import java.util.Scanner;
//Scanner sc = new Scanner(System.in);

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;

        System.out.print("Enter a number: ");
        num1 = sc.nextInt();
        System.out.print("Enter a number: ");
        num2 = sc.nextInt();
        System.out.print("Enter a number: ");
        num3 = sc.nextInt();

        System.out.println(num1-num2-num3);
    }
}