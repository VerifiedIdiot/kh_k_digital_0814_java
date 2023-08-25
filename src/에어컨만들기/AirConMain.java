package 에어컨만들기;

import java.util.Scanner;
import static java.lang.Thread.sleep;


public class AirConMain {
    public static void main(String[] args) throws InterruptedException {
        Aircon lgAirCon = new Aircon();
        int elapsedTime = 0; // 경과 시간을 계산하기 위한 변수
        boolean isSetTemp = false; // 온도를 변경할 상태인지 판단하는 조건
        Scanner sc = new Scanner(System.in);
        System.out.print("에어컨을 켜시겠습니까?(yes/no) : ");
        String isOn = sc.next();

        if(isOn.equals("yes")) {
            lgAirCon.setPower(true);
            lgAirCon.setAirConState();
            while (true) {
                sleep(300);
                elapsedTime++;
                switch (lgAirCon.getWindStep()) {
                    case 1 : if(elapsedTime >= 60) isSetTemp = true; break; // 1단
                    case 2 : if(elapsedTime >= 30) isSetTemp = true; break; // 2단
                    case 3 : if(elapsedTime >= 20) isSetTemp = true; break; // 3단
                    default: if (elapsedTime >= 61) isSetTemp = true;
                }
                if (isSetTemp) {
                    if (lgAirCon.isHeater()) lgAirCon.setCrrTemp(1);
                    if (lgAirCon.isCooler()) lgAirCon.setCrrTemp(-1);
                    lgAirCon.airConInfo();
                    isSetTemp = false; // 온도 변경 이 후 초기화
                    elapsedTime = 0; // 온도 변경 이 후 초기화
                }
                if (lgAirCon.getCrrTemp() == lgAirCon.getSetTemp()) {
                    System.out.println("종료");
                    break;
                }
            
            }
        }
    }
}
