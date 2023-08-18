package N개의숫자합;

import java.util.Scanner;

// N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오
// 첫째 줄에 숫자의 개수 N (1 <= N <= 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
// 입력으로 주어진 숫자 N개의 합을 출력한다.
// [힌트] 입력을 문자열로 간주해야 함. 문자열에 하나의 문자를 추출해야 함.
// 추출한 문자가 1이라면 '0'
public class NumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //int N = sc.nextInt();  // 숫자의 개수 입력
        String number = sc.next();  // 숫자 문자열 입력

        int sum = 0;
        for (int i = 0; i < number.length() ; i++) {
            sum = sum + number.charAt(i) - '0';  // 문자에서 '0'을 빼서 실제 숫자값을 얻음
        }

        System.out.println(sum);  // 합 출력
    }
}
