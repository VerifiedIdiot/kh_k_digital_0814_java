package 상근이알람;

import java.util.Scanner;

public class AlarmEx {
    public static void main(String[] args) {
        // 시간과 분을 입력 받기 위한 스캐너 생성
        // 시간과 분을 각각 입력 받음
        // 45분을 빼야 되므로 시간과 분을 총 몇분인지 환산하고 거기서 45를 뺌
        // 계산된 시간이 45분 보다 작으면 하루전날 이므로 하루의 시간 만큼 더해줌
        // 결과를 시간과 분으로 환산해서 출력 해줌
        int hour, min;
        String time;
        Scanner sc = new Scanner(System.in);
        System.out.print("시간 입력 : ");
        hour = sc.nextInt();
        System.out.print("분 입력 : ");
        min = sc.nextInt();


        if (min - 45 < 0) {
            hour = hour - 1;
            min = min + 15;
        } else {
            min = min + 45;
        }

        if (hour < 0) {
            hour = 23;
        }

        if (10 < hour && hour < 24 && min < 60) {

            time = Integer.toString(hour) + ":" + Integer.toString(min);
            System.out.print("설정된 시간은 다음과 같습니다: " + time);

        } else if (hour < 10 && min < 60) {

            time = Integer.toString(0)+ Integer.toString(hour) + ":" + Integer.toString(min);
            System.out.print("설정된 시간은 다음과 같습니다: " + time);

        }else {
            System.out.print("옳바른 값을 입력해 주세요");
        }
    }

}
