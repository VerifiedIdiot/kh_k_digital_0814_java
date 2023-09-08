package 백준알고리즘여러숫자의합;

import java.util.Scanner;

public class SumTotal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;

        while (true) {
            System.out.print("해당 값을 입력하세요 : ");
            n = sc.nextInt();
            if (n >= 1 && n <= 1000) {
                break;
            } else {
                System.out.println("범위 내의 값을 다시 입력 하세요.");
            }

        }
        for (int i = 1; i <=n; i++) {
            sum += i;
        }
        System.out.println("총합은 : "+sum+" 입니다.");
    }
}
