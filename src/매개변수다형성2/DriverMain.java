package 매개변수다형성2;

import java.util.Scanner;

public class DriverMain {
    public static void main(String[] args) {
        Driver driver = new Driver("곰돌이사육사");
        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        SportsCar sportsCar = new SportsCar();
        Scanner sc = new Scanner(System.in);
        System.out.print("운전하고 싶은 차를 선택 [1]버스, [2]택시, [3]스포츠카 : ");

        int selCar = sc.nextInt();

        switch (selCar) {
            case 1 : driver.drive(bus);
                break;
            case 2 : driver.drive(taxi);
                break;
            case 3 : driver.drive(sportsCar);
                break;
                default: System.out.println("차량 선택을 잘 못 하셨습니다.");
        }
    }
}
