package 백준알고리즘A더하기B는;

import java.util.Scanner;

public class CalAandB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("테스트 케이스 갯수를 입력해 주세요 : ");
        int T = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < T; i++) {
            System.out.print("A와 B의 값을 (예: 3 4) 형식으로 입력해 주세요 : ");
            String input = sc.nextLine();
            String[] numbers = input.split(" "); // 공백으로 문자열을 분리
            int A = Integer.parseInt(numbers[0]);
            int B = Integer.parseInt(numbers[1]);

            if(A > 0 && A < 10 && B > 0 && B < 10) {
                System.out.println(A + B);
            } else {
                System.out.println("A와 B의 값은 0보다 커야 하고 10보다 작아야 합니다.");
            }
        }
    }
}
