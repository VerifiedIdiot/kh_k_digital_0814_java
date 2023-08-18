package While문;
// 반복횟수를 알 수 없는 경우에 대한 예제
// do ~ while 은 참이든 거짓이든 최소 한번이상 반복문을 실행하고 참이면 계속 진행 , 거짓이면 반복 x

import java.util.Scanner;

public class WhileEx2 {
    public static void main(String[] args) {
        int age; // 나이를 입력 받는 경우

//        Scanner sc = new Scanner(System.in);
//
//        while (true) { // 이렇게 불린 값으로 조건을 거는 경우 무한히 반복한다 (반드시 탈출문이 필요)
//            System.out.print("나이를 입력 하쇼 :");
//            age = sc.nextInt();
//            if(age > 0 && age < 200)
//                break; // 1 ~ 200 사이의 값만 간주
//
//            System.out.println("나이를 잘 못 입력하셨습니다.");
//
//        }
            do {
                System.out.print("나이를 입력 하쇼 :");
                Scanner sc = new Scanner(System.in);
                age = sc.nextInt();
            } while (age <= 0 || age >= 200);

            System.out.println("입력하신 나이는 " + age + "입니다.");
    }
}
