package 연산자;
// 산술연산자 : 사칙연산(+, -, *, /)과 나머지 연산자(%)

import java.util.Scanner;

public class OperateClass {
    public static void main(String[] args) {
        int num1 = 10, num2 = 4;
//        System.out.println("덧셈 : " + (num1 + num2));
//        System.out.println("뺄셈 : " + (num1 - num2));
//        System.out.println("곱셈 : " + (num1 * num2));
//        System.out.println("나눗셈 : " + ((double)num1 / num2));
//        System.out.println("나머지 : " + (num1 % num2));
//        System.out.println("몫 : " + (num1 / num2));
        // 대입 연산자 : 변수에 값을 대입하는 연산자 ( = )
        // 복합 대입 연산자로 인해 값이 바뀐경우 , 초기에 선언한 값으로 초기화 되지않고 유지가 된다
//        System.out.println(num1 += 2); // 복합대입 연산자 : num1 = num1 + 2;
//        System.out.println(num1 -= 2);
//        System.out.println(num1 *= 2);
//        System.out.println(num1 /= 2);
        // 증감 연산자 : 단향연산자, 피연산자 값을 1증가 또는 1감소 시키는 연산자
        //System.out.println(++num1); // 11
//        int tmp = num1++; // 이러면 num1을 tmp에 먼저 대입한 후 증가가 된다
//        int x = 5;
//        int y = 2 * ++x;  // y는 12 (2 * 6)
//        int z = 2 * x++;  // z는 12 (2 * 6), 그 후에 x는 7이 됨.
//        System.out.println(tmp);
//        System.out.println(num1);
        // 비교 연산자 : 두개의 피 연산자를 비교해서 어느쪽이 큰지 비교
        int x = 10;
        int y = 20;
        boolean rst1, rst2, rst3;
        //                System.out.println(x > y); // 이러면 거짓
//                System.out.println(y > x); // 이러면 참
//                System.out.println(x == y); // 이러면 거짓
//                System.out.println(x != y); // 이러면 참
//                System.out.println(x >= y); // 이러면 거짓
//                System.out.println(x <= y); // 이러면 참
        // 논리 연산자 : &&(AND : 둘다 참인 경우 참) , || (OR 연산자 , 둘중 하나만 참이면 참)
        // ! : NOT 연산자 , 현재가 참이면 거짓
//        rst1 = (x > 0) && (x > y); // 거짓
//        rst2 = (x > 0) || (x > y); // 참
//        rst3 = !(x > 0) || (x < y); // 거짓
//        System.out.println((rst1 + " " + rst2 + " " + rst3));
        // 삼항연산자 : 3개의 피연산자를 필요로 하는 연산자 , 프론트엔드에서는 필수 리액트할때
//        Scanner sc = new Scanner(System.in); // 입력을 받기 위한 스캐너 객체 생성
//        System.out.print("나이를 입력 하세요 : ");
//        int age = sc.nextInt();
//        boolean isAdult = (age > 19) ? true : false;
//        System.out.println(isAdult);

//      문자열 결합 연산자
//        System.out.println("Java" + 18.04 + 12);
//        System.out.println(3 + 3.3 + "JDK");

        // 연산자 우선 순위 확인
        int val1 = 5;
        int val2 = 5;
        int val3 = 5;
        int result1, result2, result3;

        result1 = val1 + val2 * val3; // 30
        result2 = (val1 + val2) * val3; // 50
        result3 = val1 + (++val2) * val3; // 35
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);


    }
}
