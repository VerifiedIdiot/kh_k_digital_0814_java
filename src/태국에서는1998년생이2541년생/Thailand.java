package 태국에서는1998년생이2541년생;

import java.util.Scanner;

public class Thailand {
    public static void main(String[] args) {
        int thai = 2541;
        int korea = 1998;
        int gap = thai - korea;
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println("불기에서 서기로 전환한 년도는 " +(input-gap) +"년 입니다.");
    }
}
