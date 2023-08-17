package 연습문제;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("성적을 입력하슈 : ");
        int score = sc.nextInt();
        if(score >= 90 && score <= 100) {
            System.out.print("A");
        } else if (score >= 80 && score <=89) {
            System.out.print("B");
        } else if (score >= 70 && score <=79) {
            System.out.print("C");
        } else if (score >= 60 && score <=69) {
            System.out.print("D");
        } else if (score > 100) {
            System.out.print("잘못된 성적을 입력");
        } else {
            System.out.print("F");
        }
    }
}
