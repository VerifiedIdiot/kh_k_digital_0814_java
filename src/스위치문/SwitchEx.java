package 스위치문;

import java.util.Scanner;

// 조건에 조건식이 올 수 없고, 조건의 값이 와야 함.
// 조건값에는 정수, 문자, 문자열이 올 수 있음.
// 장점은 if문에 비해서 가도성이 좋음, 성능이 약간 좋음
// 단점은 조건식이나 범위를 명시할 수 없음
public class SwitchEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("계절을 입력 하세요 : ");
        String season = sc.next();
        switch(season) {
            case "spring"  : // 해당 조건이 실행 됨
                System.out.println("꽃이 피는 봄이 왔어요^^");
                break; // 해당 조건을 종료
            case "summer" :
                System.out.println("무더운 여름 입니다.");
                break;
            case "fall":
            case "autumn" :
                System.out.println("쓸쓸한 가을 입니다.");
                break;
            case "winter":
                System.out.println("아직 겨울이네요ㅠㅠㅠㅠㅠㅠ");
                break;
            default :
                System.out.println("계절을 잘 못 입력 했습니다.");
        }
    }
}
