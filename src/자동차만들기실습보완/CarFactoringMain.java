package 자동차만들기실습보완;

import java.util.Scanner;

public class CarFactoringMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 자동차 시뮬레이터에 오신 것을 환영합니다 ===");

        // 이동 지역 선택
        System.out.println("목적지를 선택하세요: ");
        System.out.println("1. 부산 (400km)");
        System.out.println("2. 대전 (150km)");
        System.out.println("3. 강릉 (200km)");
        System.out.println("4. 광주 (300km)");
        int choice = scanner.nextInt();
        int distance = 0;
        switch (choice) {
            case 1:
                distance = 400;
                break;
            case 2:
                distance = 150;
                break;
            case 3:
                distance = 200;
                break;
            case 4:
                distance = 300;
                break;
            default:
                System.out.println("잘못된 선택입니다!");
                return;
        }

        // 승객 수 선택
        System.out.println("승객 수를 입력하세요 (1~100): ");
        int passengers = scanner.nextInt();
        if (passengers < 1 || passengers > 100) {
            System.out.println("잘못된 승객 수입니다!");
            return;
        }

        // 차량 선택
        System.out.println("자동차를 선택하세요: ");
        System.out.println("1. 스포츠카");
        System.out.println("2. 승용차");
        System.out.println("3. 버스");
        choice = scanner.nextInt();
        AbstractCar car;
        switch (choice) {
            case 1:
                car = new SportsCar("스포츠카");
                break;
            case 2:
                car = new Sedan("승용차");
                break;
            case 3:
                car = new Bus("버스");
                break;
            default:
                System.out.println("잘못된 선택입니다!");
                return;
        }

        // 부가 기능 활성화 선택
        System.out.println("특별 기능을 활성화하시겠습니까? (예/아니오)");
        String response = scanner.next();
        if (response.equalsIgnoreCase("예")) {
            car.activateSpecialFeature();
        }

        // 결과 출력
        printCarInfo(car, distance);

        scanner.close();
    }

    public static void printCarInfo(AbstractCar car, int distance) {
        System.out.println("\n=== " + car.getName() + " ===");
        System.out.println("이동 시간: " + car.calculateTravelTime(distance) + " 분");
        System.out.println("총 비용: " + car.calculateTotalCost(distance) + " 원");
        System.out.println("주유 횟수: " + car.calculateRefuelCount(distance));
    }
}