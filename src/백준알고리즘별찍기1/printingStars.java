package 백준알고리즘별찍기1;

import java.util.Scanner;

public class printingStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        for (int i = 0; i <= n; i++) {
//            System.out.println("*".repeat(i));
//        }
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
