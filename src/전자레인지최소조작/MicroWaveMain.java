package 전자레인지최소조작;

import java.util.Scanner;

public class MicroWaveMain {
    public static void main(String[] args) {
        int time;
        int[] food = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.print("요리시간(초) : ");
        time = sc.nextInt();
        for (int i = 0; i < food.length; i++) {
            food[i] = sc.nextInt();
        }
        food[0] = time / 300;
        food[1] = time % 300 / 60;
        food[2] = time % 300 % 60 / 10;
        if (time % 10 != 0) {
            System.out.println("-1 , ");
        } else {
            System.out.println(food[0] + "회 " + food[1] + "회 " + food[2] + "회 입니다.");
        }
    }
}