package Math클래스;
// Math 클래스는 수학에서 자주 사용하는 상수들과 함수를 미리 구현 해 놓은 클래스
// Math 클래스이 모든 메소드는 static 이므로 , 객체 생성없이 바로 사용
// java.lang 패키지에 포함되어 있어 import 가 필요 없음
// random() 메소드는 0.1 ~ 1미만의 임의의 double형 값을 반환
public class MathClass {
    public static void main(String[] args) {
        System.out.println((int) Math.random() * 100); // 0 ~ 99
        // ceil() : 소수점이하가 있으면 무조건 올림
        System.out.println(Math.ceil(10.0));
        System.out.println(Math.ceil(10.1));
        System.out.println(Math.ceil(10.00000001));
        // floor() : 소수점 이하를 무조건 날림
        System.out.println(Math.floor(10.0));
        System.out.println(Math.floor(10.9));
        System.out.println(Math.floor(10.00000001));
        // round() : 반올림 : 소수점 첫째 자리에서 반올림
        System.out.println(Math.round(10.0));
        System.out.println(Math.round(10.4999));
        System.out.println(Math.round(10.5));
        // max()와 min()
        int x = 10;
        int y = 20;
        System.out.println(Math.max(x, y));
        System.out.println(Math.min(x, y));
    }
}
