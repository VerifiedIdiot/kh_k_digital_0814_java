package 윤년계산하기;

// 연도가 4로 나누어 떨어진다.
// 100으로 나누어 떨어지면 연도는 윤년이 아니다.
// 400 으로 나누어 떨어지면 윤년이다.


import java.util.Scanner;

public class ExampleTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연도를 입력하쇼 :");
        int year = sc.nextInt();

        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + "는 윤년입니다.");
            // 참인 조건
        } else {
            System.out.println(year + "는 윤년이 아닙니다.");
            // 거짓인 조건
        }
    }
}
