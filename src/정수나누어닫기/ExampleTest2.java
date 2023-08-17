package 정수나누어닫기;

import java.util.Scanner;

// 100의 자리 정수를 입력 받아서 3개의 변수에 나누어 대입 하기
public class ExampleTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("100의 자리 정수 입력 : ");
        int num = sc.nextInt();
        int a = num / 100; // 100으로 나눈 몫을 구함
        int b = (num % 100) / 10; // 100 으로 나눈 뒤 나머지에 10으로 다시 나누기
        int c = num % 10; // 6이라는 나머지 취함
        System.out.println("100의 자리 : " + a + " , 10의자리 :" + b + ", 1의자리" + c);
    }
}
