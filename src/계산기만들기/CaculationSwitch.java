package 계산기만들기;

import java.util.Scanner;

public class CaculationSwitch {
    public static void main(String[] args) {
        int x, y;
        char op;
        Scanner sc = new Scanner(System.in);
        System.out.print("계산식 입력 : ");
        x = sc.nextInt();
        op = sc.next().charAt(0);
        y = sc.nextInt();
        switch (op) {
            case '+' :
                System.out.println("덧셈 : " +(x + y));
                break;
            case '-' :
                System.out.println("뺄셈 : " +(x - y));
                break;
            case '*' :
                System.out.println("곱셈 : " +(x * y));
                break;
            case '/' :
                System.out.println("나눗셈 : " +((double)x / y));
                break;
            default:
                System.out.println("연산자를 잘 못 입력 하셨습니다." );

        }
    }
}
