package 에어컨만들기;

import java.util.Calendar;
import java.util.Scanner;

// 전원 : ON / OFF
// 온도 설정 기능
// 현재 온도 표시 기능
// Cooler ON / OFF
// Heater ON / OFF
// 바람세기 : 1단 / 2단 / 3단
public class Aircon {
    private boolean isPower; // ON // OFF
    private int setTemp; // 온도 설정 기능
    private int crrTemp; // 현재 온도
    private boolean isCooler; // 냉방
    private boolean isHeater; // 난방
    private int windStep; // 1단 2단 3단

    Aircon() {
        // 에어컨의 현재 온도를 보여주기 위한 임의 값 할당
        final  int[] MonthTemp = {-5, 3, 10, 15, 22, 28, 32, 30, 24, 16, 8, 2};
        Calendar now = Calendar.getInstance();
        int month = now.get(Calendar.MONTH); // 배열의 인덱스와 같아 0 == 1월
        crrTemp = MonthTemp[month];  // now의 달력 객체를 배열화 후 해당 배열의 요소를 대입
        isPower = false;
        setTemp = 18;
        isCooler = false;
        isHeater = false;
        windStep = 1;

    }
    void airConInfo() {
        String onOffStr = (isPower) ? "ON" : "OFF";
        String heaterStr = (isHeater) ? "ON" : "OFF";
        String coolerStr = (isCooler) ? "ON" : "OFF";
        final String[] windStr = {"", "1단계", "2단계", "3단계"};
        System.out.println("=".repeat(10) + "에어컨 정보" + "=".repeat(10));
        System.out.println("전원 : " + onOffStr);
        System.out.println("현재 온도 : " + crrTemp);
        System.out.println("설정 온도 : " + setTemp);
        System.out.println("히터 : " + heaterStr);
        System.out.println("쿨러 : " + coolerStr);
        System.out.println("바람 세기 : " + windStr[windStep]);
    }
    public void setAirConState() {
        Scanner sc = new Scanner(System.in);
        System.out.println("현재 온도는 " + crrTemp + " 입니다");
        System.out.print("온도를 설정 하세요");
        setTemp = sc.nextInt();
        System.out.println("설정 온도는 " + setTemp + " 입니다.");
        System.out.print("바람 세기를 선택 하세요 (1 | 2 | 3) : ");
        windStep = sc.nextInt();
        if (crrTemp > setTemp) { // 설정 온도가 현재 온도보다 낮은 상태 즉, 더워잉
            System.out.println("Cooler가 동작 합니다.");
            isCooler = true;
            isHeater = false;
        } else if (crrTemp < setTemp) { // 설정 온도가 현재 온도보다 높은 상태 즉 , 추워잉
            isCooler = false;
            isHeater = true;
        } else {
            isCooler = false;
            isHeater = false;
        }
    }
    public void setPower(boolean power) {
        isPower = power;
    }
    public int getWindStep() {
        return windStep;
    }
    public boolean isHeater() {
        return isHeater;
    }
    public boolean isCooler() {
        return isCooler;
    }
    public void setCrrTemp(int n) { // 매개변수의 정수 값을 받아 현재 온도를 변경해줌
        crrTemp += n;
    }
    public int getCrrTemp() { // 현재 온도를 읽는 메소드
        return crrTemp;
    }
    public int getSetTemp() { // 설정 온도를 읽는 메소드
        return setTemp;
    }


}
