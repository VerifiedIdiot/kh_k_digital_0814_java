package 시험성적;

import java.util.Scanner;

public class gradeVerifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int grade = sc.nextInt();
            if (grade >= 90 && grade < 101) {
                System.out.println("A");
                break;
            }

        }



    }
}
