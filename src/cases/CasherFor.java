package cases;

import java.util.Scanner;

public class CasherFor {
    public static void main(String[] args) {
        // try catch문 사용 //
        try {
            System.out.println("장바구니엔 5가지 넣음");
            System.out.println("--- 계산 시작 ---");
            int Price_1 = 40;
            int Price_2 = 140;
            int Price_3 = 5;
            int Price_4 = 0;
            int[] prices = new int[5];

            Scanner scanner = new Scanner(System.in);

            for (int first = 0; first < prices.length; first++) {
                System.out.print((first + 1) + " 번째 가격 : ");
                int price = scanner.nextInt();

                if (price <= 100) {
                    // 100원 이하인 경우
                    System.out.println("입력한 금액: " + price + "원");
                } else {
                    // 100원 초과인 경우
                    price = 0;
                    System.out.println("입력한 금액이 100원을 초과했습니다. 0원으로 적용합니다.");
                }

                System.out.println("적용된 금액: " + price + "원");
                prices[first] = price;
            }

            System.out.println("--- 담은 총합 ---");
            int sum = 0;
            for (int first = 0; first < prices.length; first++) {
                System.out.print(prices[first]);
                sum += prices[first];
                if (first < prices.length - 1) {
                    System.out.print(",");
                }
            }

            System.out.println();
            System.out.println("담은 총합: " + sum + "원");

            scanner.close();

        } catch (Exception e) {
            // TODO: handle exception

        }

    }
}
