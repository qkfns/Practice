import java.util.Scanner;

public class DogFood {
    public static void main(String[] args) {
        int kg = 1;
        int g = 10;
        int DogKg;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("강아지 몸무게를 입력해주세요.");
            DogKg = scanner.nextInt();
            System.out.println("1일 권장 급여량: " + (double) DogKg * kg / g + "g");
        }catch(Exception e){
            System.out.println("오류입니다.");
        }


    }
}
