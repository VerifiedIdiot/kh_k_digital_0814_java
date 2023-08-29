package 열거타입;

import java.util.Calendar;

// 서로 연관된 상수들을 모아 놓은 것
// 실제 값 뿐만 아니라 타입까지 체크 가능
// 예전에 class 내에서 final static string 과 같이 사용하였지만 열거형으로 대체 가능
public class EnumType {
    public static void main(String[] args) {

        Week today = null;
        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK); // 주에서 몇번째 요일인지 가져 옴
        switch(week) {
            case 1 :
                today = Week.SUNDAY; break; // 열거 상수 대입
            case 2 :
                today = Week.MONDAY; break;
            case 3 :
                today = Week.TUESDAY; break;
            case 4 :
                today = Week.WEDNESDAY; break;
            case 5 :
                today = Week.THURSDAY; break;
            case 6 :
                today = Week.FRIDAY; break;
            case 7 :
                today = Week.SATURDAY; break;
        }
        System.out.println("오늘 요일 : " + today);
    }
}


enum Week {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}