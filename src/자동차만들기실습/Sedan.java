package 자동차만들기실습;

public class Sedan extends CarTypes {
    boolean isNewSeatAdded;
    int distance;
    double requiredFuel;
    public Sedan(String name) {
        super(name, 200, 12, 45, 4);

    }

    @Override
    public void activateSpecialFeature() {
        if (!isNewSeatAdded) { // 만약 추가 좌석이 아직 활성화되지 않았다면
            isNewSeatAdded = true; // 새 좌석을 활성화
            this.seatCount += 1;
            System.out.println("트렁크 대신 새 좌석이 추가 되었습니다!");

        }

    }
    public int calculateTotalCost(int distance) {
        requiredFuel = distance / this.efficiency;
        int cost = (int) (requiredFuel * 2000);

        return cost;
    }

    public int calculateRefuelCount(int distance) {
        requiredFuel = distance / this.efficiency;
        int refuelCount = (int) Math.ceil(requiredFuel / this.fuelTankSize);

        return refuelCount;
    }

    public String calculateTravelTime(int distance) {
        int totalTime = (int) (distance / this.speed * 60); // 분으로 변환
        int hours = totalTime / 60;
        int minutes = totalTime % 60;
        String time = hours + "시간 " + minutes + "분";
        return time;
    }

}
