package 자동만들기실습final;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AbstractCar car = null;
        final int[] area = {0, 400, 150, 200, 300};
        Scanner sc = new Scanner(System.in);
        System.out.print("이동 지역 [1]부산 [2]대전 [3]강릉 [4] 광주 : ");
        int city = sc.nextInt();
        System.out.print("이동할 승객 수 : ");
        int passCnt = sc.nextInt();
        System.out.print("차량 선택 [1]스포츠카 [2]승용차 [3]버스 : ");
        int carType = sc.nextInt();
        System.out.print("부가 기능 [1]ON [2]OFF : ");
        int option = sc.nextInt();

        // 여기까지가 input

        boolean isMode = (option == 1) ? true : false;
        switch (carType) {
            case 1 : car = new SportsCar();
                break;
            case 2 : car = new Sedan();
                break;
            case 3 : car = new Bus();
                break;
            default :
                System.out.println("옳바른 타입을 선택해 주세요.");

        }

        // 해당 switch 분기문을 통해 new 연산자를 통해 어떤 자식클래스를
        car.setMode(isMode); // 모드 ON/OFF
        int moveCnt = car.getMovingCnt(passCnt); // 승객의 수로 이동 횟수 구하는 메서드
        System.out.println("=".repeat(7) + car.getName() + "=".repeat(7));
        System.out.println("총 비용 : " + car.getTotalCost(area[city], moveCnt) + "원");
        System.out.println("총 주유 횟수 : " + car.getRefuelCnt(area[city], moveCnt) + "회");
        System.out.println("총 이동 시간 : " + car.getMovingTime(area[city], moveCnt));
    }
}
