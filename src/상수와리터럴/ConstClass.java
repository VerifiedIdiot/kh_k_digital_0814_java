package 상수와리터럴;
import java.util.Scanner; // 스캐너를 사용하기 위해 라이브러리 임포트

// 상수 : 변수와 마찬가지로 메모리에 저장할 공간을 확보하지만 재선언과 재할당아 불가능하다
// 값을 한번 쓰고 나면 read only가 됨
// final 키워드를 사용

public class ConstClass {
    final  static String KH_DOMAIN = "http://192/167.12.13";
    final  static String PORT_NUM = "8111";
    public static void main(String[] args) {
        final double TAX_RATE = 0.10; // 세율 값을 고정
//        Scanner sc = new Scanner(System.in) // 표준 입력을 받기 위해서 사용
//        System.out.println("수입을 입력하세요 : ");;
//        int income = sc.nextInt(); // 키보드로 부터 입력 받은 값을 정수형 변수에 대입
//        System.out.println("당신이 내야 할 세금은" + (income * TAX_RATE) + : "입니다");
//        System.out.println(KH_DOMAIN);
//        System.out.println(PORT_NUM);


    }
}
