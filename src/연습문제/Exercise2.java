package 연습문제;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        int a, b, c;
        int input = sc.nextInt();
        System.out.print("가장 큰값 : ");
        a = input / 100;
        b = (input % 100) / 10;
        c = input % 10;
        if (a > b) {
            System.out.println(Math.max(a, c));
        } else {
            System.out.println(Math.max(b,c));
        }
    }
}