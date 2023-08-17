package 시스템출력;

import java.util.Scanner;

// System.Out : 표준 출력 스트림
// print , println : 오버로딩이 적용됭 메소드이며 , 줄바꿈 차이만 있음
public class SystemOut {
    public static void main(String[] args) {
        String name = "곰돌이사육사";
        String addr = "수원시";
        int age = 22;
        char gender = 'M';
        int kor = 99, eng = 88, mat = 40;
//        double pi = 3.144444444;
//        System.out.println(age);
//        System.out.println(name);
//        // "%s" 는 형식 지정자 중 하나로 문자열을 출력하기 위해서 사용됨
//        System.out.printf("%s" , name);
//        System.out.printf("%.2f\n" , pi);
//        System.out.println("====== Java Style ======");
//        System.out.println("이름 : " + name);
//        System.out.println("주소 : " + addr);
//        System.out.println("성별 : " + gender);
//        System.out.println("나이 : " + age);
//        System.out.println("총점 : " + (kor + eng + mat)); // 연산자 우선 순위가 적용된 괄호 내의 데이터 먼저 처리
//        System.out.println("평균 : " + (((double)kor + eng + mat) / 3 )); // 연산자 우선 순위 적용 동일

        // C언어 스타일 : 서식을 지정하는 스타일
        // 서식지정자 : %d(정수), %ld(long 타입정수), %u(보호 없는 정수형), %f(실수형) %c(문자),
        // 이스케이프 시퀀스 : \n(줄바꿈) , \r(캐리지 리턴 커서를 라인의 처음으로 이동) , \t(탭) , \b(백스페이스)
//        System.out.printf("이름 : %s\n" , name);
//        System.out.printf("오늘의 습도는 %.2f%% 입니다." , 85.555555); // 실수형 출력, 소수점이하 2자리까지 출력
//        System.out.printf("성별 : %c\n" , gender); //문자 출력
//        System.out.println("안녕하세요 저의 이름은 \"곰돌이사육사\"입니다. "); //문자 출력
//
//        System.out.println("Apple\rBanna\tOrange\b\b\n"); //문자 출력
//
//        System.out.printf("|%-6d|%3d|%-6d|\n", 100, 2000, 30000); // || 사이에 공백을 %d값으로 조절
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        for(int i = 1; i <= n * n; i++) {
            System.out.printf("%4d", i);
            if(i % n == 0) System.out.println();


        }
    }
}
