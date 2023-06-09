import java.util.Scanner;

public class cla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 정수 A 입력
        double A = scanner.nextInt();

        // 정수 B 입력
        double B = scanner.nextInt();

        // A/B 출력
        double result = (double) A / B;
        System.out.println(result);

        scanner.close();
    }
}