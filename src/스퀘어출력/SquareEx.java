package 스퀘어출력;

import java.util.Scanner;

public class SquareEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input : ");
        int n = sc.nextInt();
        for (int i = 0; i <= n * n; i++) {
            System.out.printf("%3d", i);
            if (i % n == 0) System.out.println();
        }
    }
}