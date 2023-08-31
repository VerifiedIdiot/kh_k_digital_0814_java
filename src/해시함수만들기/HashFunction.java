package 해시함수만들기;

import java.util.Scanner;

public class HashFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");

        String in = sc.next();
        int sum = 0;
        for (int i = 0; i < in.length(); i++) {
            sum += in.charAt(i); // 문자열에서 문자의 ASCII 코드값을 더해줌
        }
        System.out.println("배열의 인덱스 : " + (sum % 100));
    }
}
