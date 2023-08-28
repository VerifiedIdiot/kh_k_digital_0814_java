package 자동차만들기실습;

import java.util.Scanner;

public class CarFactoringMain {
    public static void main(String[] args) {

        String name = null;

        SportsCar car1 = new SportsCar(name);
        Sedan car2 = new Sedan(name);
        Bus car3 = new Bus(name);
        int area;
        int passenger;
        int vehicleType;
        int optional;

        Scanner sc = new Scanner(System.in);

        System.out.print("이동 지역 선택 [1]부산 [2]대전 [3]강릉 [4] 광주 (숫자만 입력가능) :");
        area = sc.nextInt();
        System.out.println("이동할 승객 수 입력 : ");
        passenger = sc.nextInt();
        System.out.println("이동할 차량 선택 [1]스포츠카 [2]승용차 [3]버스 :");
        vehicleType = sc.nextInt();
        System.out.println("부가 기능 [1]ON [2]OFF :");
        optional = sc.nextInt();

        int distance = getDistance(area);
        if (distance == -1) {
            System.out.println("잘못된 지역 선택으로 프로그램을 종료합니다.");
            System.exit(0);
        }

        int selectedPassenger = getPassenger(passenger);
        if (selectedPassenger == -1) {
            System.out.println("잘못된 승객 수 선택으로 프로그램을 종료합니다.");
            System.exit(0);
        }

        int selectedVehicle = getVehicleType(vehicleType);
        int selectedOptional = getOptional(optional);

        if (selectedVehicle == 1) {
            name = "스포츠카";
            car1 = new SportsCar(name);

            if (selectedOptional == 1) {
                car1.activateSpecialFeature();// 터보 기능 활성화
                System.out.println("=====" + name + "=====");
                System.out.println("총 비용 : " + car1.calculateTotalCost(distance) + "원");
                System.out.println("총 주유 횟수 : " + car1.calculateRefuelCount(distance) + "회");
                System.out.println("총 이동 시간 : " + car1.calculateTravelTime(distance));
            }
        } else if (selectedVehicle == 2) {
            name = "승용차";
            car2 = new Sedan(name);
            if (selectedOptional == 1) {
                car2.activateSpecialFeature();  // 터보 기능 활성화
                System.out.println("=====" + name + "=====");
                System.out.println("총 비용 : " + car2.calculateTotalCost(distance) + "원");
                System.out.println("총 주유 횟수 : " + car2.calculateRefuelCount(distance) + "회");
                System.out.println("총 이동 시간 : " + car2.calculateTravelTime(distance));
            }

        } else if (selectedVehicle == 3) {
            name = "버스";
            car3 = new Bus(name);
            if (selectedOptional == 1) {
                car3.activateSpecialFeature();  // 터보 기능 활성화
                System.out.println("=====" + name + "=====");
                System.out.println("총 비용 : " + car3.calculateTotalCost(distance) + "원");
                System.out.println("총 주유 횟수 : " + car3.calculateRefuelCount(distance) + "회");
                System.out.println("총 이동 시간 : " + car3.calculateTravelTime(distance));
            }

        } else {
            System.out.println("잘못된 차량 선택으로 프로그램을 종료합니다.");
            System.exit(0);
        }

    }


    private static int getDistance(int area) {
        switch (area) {
            case 1:
                System.out.println("부산을 선택하였습니다.");
                return 450;
            case 2:
                System.out.println("대전을 선택하였습니다.");
                return 200;
            case 3:
                System.out.println("강릉을 선택하였습니다.");
                return 250;
            case 4:
                System.out.println("광주를 선택하였습니다.");
                return 300;
            default:
                System.out.println("잘못된 지역 번호입니다.");
                return -1;
        }
    }

    private static int getPassenger(int passenger) {
        if (passenger < 100) {
            System.out.println(passenger + "명을 선택하였습니다.");
            return passenger;
        } else {
            System.out.println("100명을 초과하여 입력하지 마세요.");
            return -1;
        }
    }

    private static int getVehicleType(int vehicleType) {
        switch (vehicleType) {
            case 1:
                System.out.println("스포츠카를 선택하였습니다.");
                return 1;
            case 2:
                System.out.println("승용차를 선택하였습니다.");
                return 2;
            case 3:
                System.out.println("버스를 선택하였습니다.");
                return 3;
            default:
                System.out.println("잘못된 차량 타입을 선택하였습니다..");
                return -1;
        }
    }

    private static int getOptional(int optional) {
        switch (optional) {
            case 1:
                System.out.println("옵션을 선택하셨습니다.");
                return 1;
            case 2:
                System.out.println("옵션을 선택하지 않았습니다.");
                return 2;
            default:
                System.out.println("잘못된 옵션 선택입니다.");
                return -1;
        }
    }

}
