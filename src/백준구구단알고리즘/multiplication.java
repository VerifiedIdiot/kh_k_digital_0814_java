package 백준구구단알고리즘;

import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.println(val +"*"+ i + "=" +(val*i));
        }
    }
}
