import java.util.Scanner;

public class Adder {
    public static void main(String[] args) {
        int num1,num2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");
        num1 = scanner.nextInt();
        System.out.println("숫자를 하나더 입력하세요.");
        num2 = scanner.nextInt();

        System.out.println("입력한 값을 더한 값 = " + (num1+num2));
    }

}
