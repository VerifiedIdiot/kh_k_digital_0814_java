package Receipt;

import java.util.Scanner;

public class CostcoIsSoExpensive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 줄: 총 금액
        int total = sc.nextInt();

        // 두 번째 줄: 항목의 개수
        int count = sc.nextInt();

        // 각 줄에 항목의 가격과 수량을 받음
        for (int i = 0; i < count; i++) {
            int price = sc.nextInt();
            int num = sc.nextInt();

            total = total - (price * num);
        }

        if (total == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
