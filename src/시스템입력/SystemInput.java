package 시스템입력;
// Scanner 클래스를 사용해서 입력 받음


import java.util.Scanner;

public class SystemInput {
    public static void main(String[] args) {
        // sc는 Scanner 클래스에 대한 변수
        // 클래스란 설계 도면이라고 생각하면 된다.
//        Scanner sc = new Scanner(System.in); // 스캐너에 대한 인스턴스 객체 생성
//        byte a = sc.nextByte(); // byte형 입력을 받아 반환
//        short b = sc.nextShort(); // short형의 입력을 받아 반환
//        int c = sc.nextInt(); // int 형의 입력을 받아 반환
//        long d = sc.nextLong(); // long 형의 입력을 받아 반환
//        char ch = sc.next().charAt(0); // 문자열에서 0번째 문자를 추출
//        float e = sc.nextFloat(); // float형의 입력을 받아 반환
//        String h = sc.next(); // 공백 기준으로 입력 받음
//        String I = sc.nextLine(); // 줄바꿈 문자 기준
        Scanner sc = new Scanner(System.in); // 스캐너에 대한 인스턴스 객체 생성
        System.out.print("이름을 입력하쇼 : ");
        String name = sc.next(); // 이름을 입력 받은 후 공백이나 줄바꿈이 일어나면 다음으로 넘어감

        System.out.print("주소를 입력하쇼 : ");
        String addr = sc.nextLine(); // 줄바꿈이 일어나면 다음 입력으로 넘어감
        sc.nextLine(); // 버퍼 비우기 , 위치는 상관이 없다.
        System.out.print("성별을 입력하쇼 : ");
        char gender = sc.next().charAt(0); // 입력 받은 문자열에서 맨앞의 문자 1자 추출
        System.out.print("나이를 입력하쇼 : ");
        int age = sc.nextInt(); // 줄바꿈이 일어나면 다음 입력으로 넘어감

        System.out.print("==== 회원 정보 출력 ====");
        System.out.print("이름 : " + name);
        System.out.print("주소 : " + addr);
        System.out.print("성별 : " + gender);
        System.out.print("나이 : " + age);
    }
}
